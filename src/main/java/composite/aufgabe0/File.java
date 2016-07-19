package composite.aufgabe0;

/**
 * Created by edutilos on 19.07.2016.
 */
public class File implements  FileSystemComponent {
    private String name;
    private int size ;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("-F: "+ name);
    }

    @Override
    public int getSize() {
        return size;
    }
}
