package adapter_facade.aufgabe0;

/**
 * Created by edutilos on 28.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        USAddress usAddress = new USAddress();
        USAddressAdapter usAddressAdapter = new USAddressAdapter(usAddress);
        boolean gueltig1 = usAddressAdapter.istGueltig("foobarbimpako", "44801", "CA");

        System.out.println(String.format("gueltig1 = %s", gueltig1));

        DEAdresse deAdresse = new DEAdresse();
        boolean gueltig2 = deAdresse.istGueltig("foobarbimpako", "44801", "Baden-Württemberg");
        System.out.println(String.format("gueltig2 = %s", gueltig2));
    }
}
