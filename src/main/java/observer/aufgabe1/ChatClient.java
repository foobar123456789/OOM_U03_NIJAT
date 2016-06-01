package observer.aufgabe1;

import java.util.ArrayList;
import java.util.Date;

public class ChatClient {
 private ArrayList<IChatBeobachter> beobachter = new ArrayList<>();
    public ChatClient() {

    }

    public void registriereBeobachter(IChatBeobachter beo) {
        beobachter.add(beo);
    }
    public void entferneBeobachter(IChatBeobachter beo) {
        beobachter.remove(beo);
    }
    public void benachrichtigeBeobachter(Nachricht nachricht) {
       for(IChatBeobachter beo: beobachter)
           beo.aktualisieren(nachricht);
    }
    public void schreibeNachricht(String text, String empfaenger){
        Nachricht nachricht = new Nachricht(new Date(), text , empfaenger);
        benachrichtigeBeobachter(nachricht);
    }
}
