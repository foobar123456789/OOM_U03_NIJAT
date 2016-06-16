package decorator.aufgabe0;

/**
 * Created by edutilos on 16.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        Bild b1 = new EinfachesBild ("lena.png");
        System.out.println("b1 = " + b1);
        KantenFilter kf ;
        kf =  new KantenFilter (b1);
        ImageUtils . speichern (kf. getDaten () , "lenaKanten.png");

        SalzPfeffer sp = new SalzPfeffer (b1);
        ImageUtils.speichern (sp. getDaten () , "lenaRauschen.png");

        MedianFilter mf = new MedianFilter(b1);
        ImageUtils.speichern(mf.getDaten(), "lenaMedian.png");
    }
}
