package factory.aufgabe1;

import javax.naming.OperationNotSupportedException;


public class WaldlaeuferBackpack extends Backpack {
    public WaldlaeuferBackpack() {
        super();
        items.add(new Brot());
        items.add(new Schwert());
        items.add(new Bogen());
    }

    @Override
    public void addItem(Item item) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("operation not supported yet.");
    }
}
