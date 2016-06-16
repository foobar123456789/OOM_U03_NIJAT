package decorator.aufgabe0;

/**
 * Created by edutilos on 16.06.2016.
 */
public class KantenFilter extends BildDekorierer{
    public KantenFilter(Bild bild) {
        super(bild);
    }

    @Override
    public int[][] getDaten() {
        System.out.println("bild = " + bild.getDaten());
        return ImageUtils . edgeFilter (bild . getDaten ());
    }
}
