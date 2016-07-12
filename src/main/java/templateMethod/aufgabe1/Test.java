package templateMethod.aufgabe1;


public class Test {
    public static void main(String[] args) {
       AktienHandler aktienHandler = new AktienHandler();
        String aktienFile = "aktien.csv";
        DerivatHandler derivatHandler = new DerivatHandler();
        String derivatFile = "derivat.txt";

        aktienHandler.execute(aktienFile);
        derivatHandler.execute(derivatFile);
    }
}
