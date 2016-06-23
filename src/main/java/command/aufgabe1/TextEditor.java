package command.aufgabe1;

/**
 * Created by edutilos on 23.06.2016.
 */
public class TextEditor {
    private String text;

    public String getText() {
        return text;
    }

    public void aendereText(String newText) {
        this.text = newText;
        System.out.println(String.format("new content = %s", text));
    }
}
