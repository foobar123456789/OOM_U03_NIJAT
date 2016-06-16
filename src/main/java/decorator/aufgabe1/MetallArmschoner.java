package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public class MetallArmschoner extends RüstungsDecorator{
    public MetallArmschoner(Charakter c) {
        super(c);
    }

    @Override
    public int getRüstungswert() {
        return 20;
    }

    @Override
    public void zeigeRüstungswert() {
        System.out.println("20 AR");
    }
}
