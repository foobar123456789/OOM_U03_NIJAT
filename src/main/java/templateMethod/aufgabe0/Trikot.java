package templateMethod.aufgabe0;

/**
 * Created by edutilos on 12.07.2016.
 */
public abstract class Trikot {
    private String grundfarbe;
    private String stoff;
    private int nummer ;
    private String name;

    public Trikot(String grundfarbe, String stoff, int nummer, String name) {
        this.grundfarbe = grundfarbe;
        this.stoff = stoff;
        this.nummer = nummer;
        this.name = name;
    }

    public void erstellen() {

        schnittErstellen();
        naehen();
        name();
        logo();
        patches();
        deko();
        System.out.println("Trikot wurde erstellt");
    }
    public void schnittErstellen() {
        System.out.println("Schnitt wurde erstellt");
    }
    public void naehen() {
        System.out.println("Trikot wurde genäht");
    }
    public void name() {
        System.out.println(name);
    }
    public abstract void logo();
    public abstract void patches() ;
    public void deko() {}
}
