package decorator.aufgabe1;

/**
 * Created by edutilos on 16.06.2016.
 */
public abstract class RüstungsDecorator implements  Charakter{
  protected Charakter c ;

    public RüstungsDecorator(Charakter c) {
        this.c = c;
    }
}
