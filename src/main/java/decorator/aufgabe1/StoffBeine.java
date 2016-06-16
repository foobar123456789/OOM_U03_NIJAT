package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public class StoffBeine extends RüstungsDecorator {
    public StoffBeine(Charakter c) {
        super(c);
    }

    @Override
    public int getRüstungswert() {
        return 3;
    }

    @Override
    public void zeigeRüstungswert() {
        System.out.println("3 AR");
    }
}
