package command.aufgabe1;

import java.util.Stack;

/**
 * Created by edutilos on 23.06.2016.
 */
public class CommandManager {
    private Stack<EditorCommand> undoItems = new Stack<>();

    public void executeCommand(EditorCommand cmd) {
        undoItems.push(cmd);
        cmd.execute();
    }

    public void undo() {
        if(undoItems.size() == 0) return ;
        EditorCommand cmd = undoItems.pop();
        if(cmd != null) {
            cmd.undo();
        }
    }
}
