package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public class Waldläufer extends  RüstungsDecorator {
    public Waldläufer(Charakter c) {
        super(c);
    }

    @Override
    public int getRüstungswert() {
        return 10;
    }

    @Override
    public void zeigeRüstungswert() {
        System.out.println("10 AR");
    }
}
