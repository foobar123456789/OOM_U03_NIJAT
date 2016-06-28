package adapter_facade.aufgabe1;

/**
 * Created by edutilos on 28.06.2016.
 */
public class Parser {
    private Scanner scanner ;

    public Parser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void parse(String sourceFile) {
        scanner.scan(sourceFile);
        System.out.println(String.format("%s was parsed", sourceFile));
    }
}
