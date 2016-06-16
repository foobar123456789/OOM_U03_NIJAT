package decorator.aufgabe0;

/**
 * Created by edutilos on 16.06.2016.
 */
public class SalzPfeffer extends BildDekorierer {
    public SalzPfeffer(Bild bild) {
        super(bild);
    }

    @Override
    public int[][] getDaten() {
        return ImageUtils.saltPepper(bild.getDaten());
    }
}
