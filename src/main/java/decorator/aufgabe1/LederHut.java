package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public class LederHut extends RüstungsDecorator {
    public LederHut(Charakter c) {
        super(c);
    }

    @Override
    public int getRüstungswert() {
        return 5;
    }

    @Override
    public void zeigeRüstungswert() {
        System.out.println("5 AR");
    }
}
