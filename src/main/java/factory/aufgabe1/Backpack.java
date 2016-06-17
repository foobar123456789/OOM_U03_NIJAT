package factory.aufgabe1;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

/**
 * Created by edutilos on 17.06.2016.
 */
public class Backpack {
    protected ArrayList<Item>  items;

    public Backpack() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) throws OperationNotSupportedException {
        items.add(item);
    }

    public void listItems() {
        for(Item item: items) {
            System.out.println(item);
            System.out.println("---------------------");
        }
    }
}
