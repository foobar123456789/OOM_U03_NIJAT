package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        Charakter mag = new MetallArmschoner(new Magier());
        System.out.println(mag.getRüstungswert());
        mag.zeigeRüstungswert();
    }
}
