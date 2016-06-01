package observer.aufgabe1;


import java.io.FileWriter;
import java.io.IOException;

public class LogWriter implements  IChatBeobachter {

    @Override
    public void aktualisieren(Nachricht nachricht) {
        String fName = nachricht.getEmpfaenger() + ".log";
        try(FileWriter writer = new FileWriter(fName, true)) {
            writer.write(nachricht.toString()+"\r\n");
        } catch(IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
