package templateMethod.aufgabe0;

/**
 * Created by edutilos on 12.07.2016.
 */
public class DeutschlandTrikot extends Trikot{
    public DeutschlandTrikot(String grundfarbe, String stoff, int nummer, String name) {
        super(grundfarbe, stoff, nummer, name);
    }

    @Override
    public void logo() {
        System.out.println("Adidas");
    }

    @Override
    public void patches() {
        System.out.println("Adler");
    }

    @Override
    public void deko() {
        System.out.println("Adlerschwingen");
    }
}
