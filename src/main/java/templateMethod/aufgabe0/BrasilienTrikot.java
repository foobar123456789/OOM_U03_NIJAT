package templateMethod.aufgabe0;

public class BrasilienTrikot extends Trikot {

    public BrasilienTrikot(String grundfarbe, String stoff, int nummer, String name) {
        super(grundfarbe, stoff, nummer, name);
    }

    @Override
    public void logo() {
        System.out.println("Brasilien Adidas");
    }

    @Override
    public void patches() {
        System.out.println("Brasilien Adler");
    }

    @Override
    public void deko() {
        System.out.println("Brasilien Adlerschwingen");
    }
}
