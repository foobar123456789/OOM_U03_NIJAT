package aufgabe1;

/**
 * Created by edutilos on 09.05.2016.
 */
public class PayPalStrategie implements Zahlungsstrategie {
    private String email;
    private String password;

    public PayPalStrategie(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void zahle(int preis) {
        System.out.println(preis + " Preis wurde von "+ this.toString()+ " bezahlt.");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "PayPalStrategie{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
