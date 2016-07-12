package templateMethod.aufgabe0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by edutilos on 12.07.2016.
 */
public class Test {

    public static void main(String[] args) {
        //Deutschland Mannschaft
        System.out.println("Deutsche Mannschaft");
        Map<Integer, String> deutschland = new HashMap<>();
        for(int i=1 ; i<=11; ++i) {
            deutschland.put(i, "Spieler #"+i);
        }

        for(Map.Entry<Integer, String> spieler: deutschland.entrySet()) {
            Integer nummer = spieler.getKey();
            String name = spieler.getValue();
            Trikot trikot = new DeutschlandTrikot("Weiss", "Pambig", nummer, name);
            trikot.erstellen();
            System.out.println();
        }

        System.out.println();
        System.out.println("Brasilien Mannschaft");
        
        
        Map<Integer , String> brasilien = new HashMap<>(); 
        for(int i= 1 ; i<=11 ; ++i) {
            brasilien.put(i, "Spieler #"+i); 
        }
        
        for(Map.Entry<Integer, String> spieler: brasilien.entrySet()) {
            Integer nummer = spieler.getKey(); 
            String name = spieler.getValue();
            Trikot trikot = new BrasilienTrikot("Gelb", "Pambig", nummer , name);
            trikot.erstellen();
            System.out.println();
        }
        System.out.println();
    }
}
