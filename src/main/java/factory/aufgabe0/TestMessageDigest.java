package factory.aufgabe0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Formatter;

/**
 * Created by edutilos on 17.06.2016.
 */
public class TestMessageDigest {
    public static void main(String[] args) {
        String [] algos = {"MD2",
        "MD5",
        "SHA-1",
        "SHA-224",
        "SHA-256",
        "SHA-384",
        "SHA-512"} ;

        for(String str: algos) {
            try {
                MessageDigest md = MessageDigest.getInstance(str);
                String algo = md.getAlgorithm();
                Provider provider = md.getProvider();
                String name = provider.getName();
                double version = provider.getVersion();
                String info = provider.getInfo();
                System.out.println("algorithm = "+ algo);
                System.out.println("provider [name, version, info] = "+ name + " , " + version + " , " + info);
                String input = "Nijat Aghayev";
                md.update(input.getBytes());
                byte[] output = md.digest();
                Formatter formatter = new Formatter();
                for(byte b: output) {
                    formatter.format("%02X", b);
                }
                System.out.println(formatter);
                System.out.println("-------------------");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }

    }
}
