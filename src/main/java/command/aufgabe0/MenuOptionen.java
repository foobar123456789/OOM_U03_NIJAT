package command.aufgabe0;

/**
 * Created by edutilos on 23.06.2016.
 */
public class MenuOptionen {
    private ActionListener openCommand ;
    private ActionListener saveCommand ;

    public MenuOptionen(ActionListener openCommand, ActionListener saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }


    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}
