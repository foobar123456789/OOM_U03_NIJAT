package adapter_facade.aufgabe0;


public class USAddressAdapter implements AddressValidator{
    private USAddress usAddress;

    public USAddressAdapter(USAddress usAddress) {
        this.usAddress = usAddress;
    }

    @Override
    public boolean istGueltig(String addresse, String plz, String bundesland) {
        return usAddress.isValidUSAddress(addresse, plz, bundesland);
    }
}
