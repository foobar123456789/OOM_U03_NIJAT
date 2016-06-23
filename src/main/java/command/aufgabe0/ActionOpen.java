package command.aufgabe0;

/**
 * Created by edutilos on 23.06.2016.
 */
public class ActionOpen implements  ActionListener {
    private Document doc ;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
