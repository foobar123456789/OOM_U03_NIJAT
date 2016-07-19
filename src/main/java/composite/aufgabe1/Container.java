package composite.aufgabe1;


import java.util.ArrayList;
import java.util.List;

public class Container implements Komponent {
   private String name;
   private List<Komponent> list ;

    public Container(String name) {
        this.name = name;
        if(list == null)  list =  new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Container: " + name);
      for(Komponent gegenstand: list) {
          if(gegenstand instanceof Gegenstand)
              System.out.print("-");
           gegenstand.print();
      }
    }

    @Override
    public double getGewicht() {
       double gewicht = 0D ;
        for(Komponent gegenstand: list) gewicht +=  gegenstand.getGewicht();
        return gewicht;
    }

    public void addComponent(Komponent komp) {
        list.add(komp);
    }

    public void removeComponent(Komponent komp) {
        list.remove(komp);
    }
}
