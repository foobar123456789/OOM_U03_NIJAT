package command.aufgabe0;

/**
 * Created by edutilos on 23.06.2016.
 */
public class Benutzer {
    public static void main(String[] args) {
        Document doc = new Document();
        ActionOpen aOpen = new ActionOpen(doc);
        ActionSave aSave = new ActionSave(doc);
        MenuOptionen mo = new MenuOptionen(aOpen , aSave);
        mo.clickOpen();
        mo.clickSave();
    }
}
