package composite.aufgabe1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Container koffer , tasche1 , tasche2 , schachtel1 , nylonTasche1 ;
        koffer = new Container("Koffer");
        tasche1 = new Container("Tasche1");
        tasche2 = new Container("Tasche2");
        schachtel1 = new Container("Schachtel1");
        nylonTasche1 = new Container("Nylon-Tasche1");


        Gegenstand hose = new Gegenstand("Hose", generateRandom());
        Gegenstand tshirt = new Gegenstand("T-Shirt", generateRandom());
        Gegenstand badenanzug = new Gegenstand("Badenanzug", generateRandom());
        koffer.addComponent(hose);
        koffer.addComponent(tshirt);
        koffer.addComponent(badenanzug);

        koffer.addComponent(tasche1);
        koffer.addComponent(tasche2);
        koffer.addComponent(schachtel1);
        koffer.addComponent(nylonTasche1);

        Gegenstand sonnenbrille = new Gegenstand("Sonnenbrille", generateRandom());
        tasche1.addComponent(sonnenbrille);
        Gegenstand ersatzbaterie = new Gegenstand("Ersatzbaterie", generateRandom());
        tasche1.addComponent(ersatzbaterie);


        Gegenstand sonnencreme = new Gegenstand("Sonnencreme", generateRandom());
        Gegenstand parfum = new Gegenstand("Parfum", generateRandom());
        nylonTasche1.addComponent(sonnencreme);
        nylonTasche1.addComponent(parfum);

        Gegenstand buch1 = new Gegenstand("Java Programmierung 1", generateRandom());
        Gegenstand buch2 = new Gegenstand("Java und JS", generateRandom());
        tasche2.addComponent(buch1);
        tasche2.addComponent(buch2);


        koffer.print();

        System.out.println(String.format("Gewicht = %f", koffer.getGewicht()));
    }

    private static Random rand = new Random();
    private static  double  generateRandom() {
        int High = 200 , Low = 50 ;
        return rand.nextDouble() * High + Low ;
    }
}
