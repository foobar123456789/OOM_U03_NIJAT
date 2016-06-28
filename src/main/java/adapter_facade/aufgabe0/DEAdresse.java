package adapter_facade.aufgabe0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edutilos on 28.06.2016.
 */
public class DEAdresse implements  AddressValidator{
    @Override
    public boolean istGueltig(String addresse, String plz, String bundesland) {
        String bundesländer[] = {
                "Baden-Württemberg",
                "Bayern",
                "Berlin",
                "Brandenburg",
                "Bremen",
                "Hamburg",
                "Hessen",
                "Mecklenburg-Vorpommern",
                "Niedersachsen",
                "Nordrhein-Westfalen",
                "Rheinland-Pfalz",
                "Saarland",
                "Sachsen",
                "Sachsen-Anhalt",
                "Schleswig-Holstein",
                "Thüringen"
        };

        List<String> listeBundesländer = new ArrayList<>();
        for(String bl: bundesländer) listeBundesländer.add(bl);

        if(!listeBundesländer.contains(bundesland)) return false ;

        for(Character ch: plz.toCharArray()) {
            if(!Character.isDigit(ch)) return false ;
        }
        for(Character ch: addresse.toCharArray()) {
            if(Character.isDigit(ch)) return false ;
        }
        return true;
    }
}
