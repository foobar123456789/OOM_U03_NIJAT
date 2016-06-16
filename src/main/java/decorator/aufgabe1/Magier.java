package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public class Magier implements  Charakter {
    @Override
    public int getRüstungswert() {
        return 1;
    }

    @Override
    public void zeigeRüstungswert() {
        System.out.println("1 AR");
    }
}
