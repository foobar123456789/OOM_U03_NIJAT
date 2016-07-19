package composite.aufgabe0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edutilos on 19.07.2016.
 */
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> list ;

    public Directory(String name) {
        this.name = name;
        if(list == null) list = new ArrayList<>();
    }

    static int level = 1 ;
    @Override
    public void print() {
        //System.out.print("-");
        System.out.println("D: "+ name);
        for(FileSystemComponent comp: list) {
           /* for(int x = 1; x <= level; ++x)
            System.out.print("-");*/
        /*    System.out.print("-");
            if(comp instanceof  Directory) {
                System.out.println("D: "+ name);

            }
*/
         /*   if(comp instanceof Directory)
            ++level;*/
            comp.print();


        }
    }

    @Override
    public int getSize() {
        int size = 0 ;
        for(FileSystemComponent comp: list) size += comp.getSize();
        return size;
    }

    public void add(FileSystemComponent comp) {
        list.add(comp);
    }
    public void remove(FileSystemComponent comp) {
        list.remove(comp);
    }
}
