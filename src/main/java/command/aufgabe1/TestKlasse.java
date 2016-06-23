package command.aufgabe1;

/**
 * Created by edutilos on 23.06.2016.
 */
public class TestKlasse {
    public static void main(String[] args) {
        CommandManager cmdManager = new CommandManager() ;
        TextEditor editor1 = new TextEditor();
        editor1.aendereText("cmd1 old cmd");
        AppendTextCommand cmd1 = new AppendTextCommand(editor1, "cmd1 new cmd");

        TextEditor editor2 = new TextEditor();
        editor2.aendereText("cmd2 old cmd");
        AppendTextCommand cmd2 = new AppendTextCommand(editor2, "cmd2 new cmd");

        TextEditor editor3 = new TextEditor();
        editor3.aendereText("cmd3 old cmd");
        AppendTextCommand cmd3 = new AppendTextCommand(editor3, "cmd3 new cmd");

        cmdManager.executeCommand(cmd1);
        cmdManager.executeCommand(cmd2);
        cmdManager.executeCommand(cmd3);

        cmdManager.undo();
        cmdManager.undo();
        cmdManager.undo();
        cmdManager.undo();
    }
}
