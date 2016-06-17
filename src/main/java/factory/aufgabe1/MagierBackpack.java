package factory.aufgabe1;

import javax.naming.OperationNotSupportedException;

/**
 * Created by edutilos on 17.06.2016.
 */
public class MagierBackpack extends Backpack {
    public MagierBackpack() {
        super();
        items.add(new Brot());
        items.add(new Manatrank());
        items.add(new Wasser());
    }


    @Override
    public void addItem(Item item) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("operation not supported");
    }
}
