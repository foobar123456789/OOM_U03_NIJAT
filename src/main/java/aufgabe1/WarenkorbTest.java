package aufgabe1;

import java.util.Random;

public class WarenkorbTest {
    public static void main(String[] args) {
       //PayPalStrategie
        PayPalStrategie str1 = new PayPalStrategie("foo", "bar");
        //KreditkartenStrategie
        KreditkartenStrategie str2 = new KreditkartenStrategie("foo", "100", "123", "05/2025");
        //Warenkorb
        Warenkorb korb = new Warenkorb(str1);
        Random rnd = new Random();
        korb.zahle(Math.abs(rnd.nextInt()));
         korb.setStrategie(str2);
        korb.zahle(Math.abs(rnd.nextInt()));
    }
}
