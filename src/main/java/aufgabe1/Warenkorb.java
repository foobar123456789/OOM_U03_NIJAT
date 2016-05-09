package aufgabe1;

/**
 * Created by edutilos on 09.05.2016.
 */
public class Warenkorb {
    private Zahlungsstrategie strategie ;

    public Warenkorb(Zahlungsstrategie strategie) {
        this.strategie = strategie;
    }

    public void zahle(int preis) {
       strategie.zahle(preis);
    }

    public Zahlungsstrategie getStrategie() {
        return strategie;
    }

    public void setStrategie(Zahlungsstrategie strategie) {
        this.strategie = strategie;
    }
}
