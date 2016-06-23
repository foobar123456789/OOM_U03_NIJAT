package command.aufgabe1;

/**
 * Created by edutilos on 23.06.2016.
 */
public class AppendTextCommand implements  EditorCommand {
    private String textAlt;
    private String textToAppend;
    private  TextEditor editor ;
    public AppendTextCommand(TextEditor editor, String textToAppend) {
        this.editor = editor;
        this.textAlt = editor.getText();
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute() {
        String old= editor.getText();
        old += " " + textToAppend;
        editor.aendereText(old);
    }

    @Override
    public void undo() {
        editor.aendereText(textAlt);
    }
}
