package observer.aufgabe1;


import java.util.Date;

public class Anzeige implements  IChatBeobachter{
    @Override
    public void aktualisieren(Nachricht nachricht) {
        System.out.println(nachricht);
    }
}
