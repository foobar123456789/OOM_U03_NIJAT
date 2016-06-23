package command.aufgabe0;

/**
 * Created by edutilos on 23.06.2016.
 */
public class ActionSave implements  ActionListener {
    private Document doc ;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
