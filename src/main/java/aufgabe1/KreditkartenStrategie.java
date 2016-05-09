package aufgabe1;

/**
 * Created by edutilos on 09.05.2016.
 */
public class KreditkartenStrategie implements  Zahlungsstrategie {
    private String name,
    nummer ,
    cvv,
    ablaufdatum;

    public KreditkartenStrategie(String name, String nummer, String cvv, String ablaufdatum) {
        this.name = name;
        this.nummer = nummer;
        this.cvv = cvv;
        this.ablaufdatum = ablaufdatum;
    }

    @Override
    public void zahle(int preis) {
        System.out.println(preis + " Preis wurde von " + this.toString() +  " bezahlt.");
    }


    public String getName() {
        return name;
    }

    public String getNummer() {
        return nummer;
    }

    public String getCvv() {
        return cvv;
    }

    public String getAblaufdatum() {
        return ablaufdatum;
    }

    @Override
    public String toString() {
        return "KreditkartenStrategie{" +
                "name='" + name + '\'' +
                ", nummer='" + nummer + '\'' +
                ", cvv='" + cvv + '\'' +
                ", ablaufdatum='" + ablaufdatum + '\'' +
                '}';
    }
}
