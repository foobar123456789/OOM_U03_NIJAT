package decorator.aufgabe0;

/**
 * Created by edutilos on 16.06.2016.
 */
public abstract class BildDekorierer {
    protected Bild bild;
    public BildDekorierer (Bild bild ){
        this.bild = bild ;
    }
    public abstract int [][] getDaten ();
}
