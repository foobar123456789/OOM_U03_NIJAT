package factory.aufgabe1;

/**
 * Created by edutilos on 17.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        String [] types = {"magier", "waldlaeufer"};
        BackpackFactory factory = new BackpackFactory();
        for(String type: types) {
            Backpack bp =  factory.createBackpack(type);
            bp.listItems();
            System.out.println();
        }
    }
}
