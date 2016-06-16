package decorator.aufgabe0;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class ImageUtils {

	public static void speichern(int[][] daten, String pfad) {
		int hoehe = daten.length;
		int breite = daten[0].length;
		BufferedImage bufferedImage = new BufferedImage(breite, hoehe,
				BufferedImage.TYPE_INT_RGB);

		for (int y = 0; y < hoehe; y++) {
			for (int x = 0; x < breite; x++) {
				bufferedImage.setRGB(x, y, daten[y][x]);
			}
		}

		File ausgabeDatei = new File(pfad);
		try {
			ImageIO.write(bufferedImage, "png", ausgabeDatei);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int[][] saltPepper(int[][] img) {
		int width = img.length;
		int height = img[0].length;

		int nSalt = 5;
		int nPepper = 5;

		int salt = height * width * nSalt / 100;
		int pepper = height * width * nPepper / 100;

		for (int i = 0; i < salt; i++) {
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);

			int rgb = 255;
			rgb = (rgb << 8) + 255;
			rgb = (rgb << 8) + 255;

			img[x][y] = rgb;
		}

		for (int i = 0; i < pepper; i++) {
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);
			img[x][y] = 0;
		}

		return img;
	}

	public static int[][] edgeFilter(int[][] img) {
		System.out.println("img = " + img);
		int width = img.length;
		int height = img[0].length;

		int[][] result = new int[width][height];

		double[][] filter = { { -1, -1, -1 }, { -1, 8, -1 }, { -1, -1, -1 } };

		double factor = 1.0;
		double bias = 0.0;

		for (int x = 0; x < width; x++)
			for (int y = 0; y < height; y++) {
				int red = 0, green = 0, blue = 0;

				for (int filterX = 0; filterX < 3; filterX++)
					for (int filterY = 0; filterY < 3; filterY++) {
						int imageX = (x - 3 / 2 + filterX + width) % width;
						int imageY = (y - 3 / 2 + filterY + height) % height;
						red += ((img[imageX][imageY] >> 16) & 0xFF)
								* filter[filterX][filterY];
						green += ((img[imageX][imageY] >> 8) & 0xFF)
								* filter[filterX][filterY];
						blue += (img[imageX][imageY] & 0xFF)
								* filter[filterX][filterY];
					}

				red = Math.min(Math.max((int) (factor * red + bias), 0), 255);
				green = Math.min(Math.max((int) (factor * green + bias), 0),
						255);
				blue = Math.min(Math.max((int) (factor * blue + bias), 0), 255);

				int rgb = blue;
				rgb = (rgb << 8) + green;
				rgb = (rgb << 8) + red;

				result[x][y] = rgb;

			}
		return result;
	}

	public static int[][] medianFilter(int[][] img) {
		int width = img.length;
		int height = img[0].length;
		int[][] result = new int[width][height];
		int edgex = 1;
		int edgey = 1;
		int[] colorArray = new int[9];
		for (int x = edgex; x < width - edgex; x++)
			for (int y = edgey; y < height - edgey; y++) {
				int i = 0;
				for (int fx = 0; fx < 3; fx++)
					for (int fy = 0; fy < 3; fy++) {
						colorArray[i] = img[x + fx - edgex][y + fy - edgey];
						i++;
					}
				Arrays.sort(colorArray);
				result[x][y] = colorArray[4];
			}

		return result;
	}

}
