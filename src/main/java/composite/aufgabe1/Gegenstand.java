package composite.aufgabe1;

/**
 * Created by edutilos on 19.07.2016.
 */
public class Gegenstand implements Komponent {

     private String name;
    private double gewicht;

    public Gegenstand(String name, double gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    @Override
    public void print() {
        System.out.println("Gegenstand: "+ name);
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }
}
