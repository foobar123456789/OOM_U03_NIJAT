package decorator.aufgabe0;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by edutilos on 16.06.2016.
 */
public class EinfachesBild extends Bild {
    public EinfachesBild(String pfad) {
        try {
            File imgFile = new File(pfad);
            BufferedImage img = ImageIO.read(imgFile);
            int breite = img. getWidth ();
            int hoehe = img. getHeight ();
            daten = new int[ hoehe ][ breite ];
            for (int zeile = 0; zeile < hoehe ; zeile ++) {
                for (int spalte = 0; spalte < breite ; spalte ++) {
                    daten [ zeile ][ spalte ] = img. getRGB (spalte , zeile );
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        }
}
