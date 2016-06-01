package observer.aufgabe1;


import java.util.Date;

public class Nachricht {
  private Date uhrzeit ;
    private String text;
    private String empfaenger;

    public Nachricht(Date uhrzeit, String text, String empfaenger) {
        this.uhrzeit = uhrzeit;
        this.text = text;
        this.empfaenger = empfaenger;
    }

    public Date getUhrzeit() {
        return uhrzeit;
    }

    public String getText() {
        return text;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    @Override
    public String toString() {
        return "Nachricht{" +
                "uhrzeit=" + uhrzeit +
                ", text='" + text + '\'' +
                ", empfaenger='" + empfaenger + '\'' +
                '}';
    }
}
