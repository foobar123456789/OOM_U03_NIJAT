package adapter_facade.aufgabe1;

/**
 * Created by edutilos on 28.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        String sourceFile = "foobar.cpp";
        Scanner scanner = new Scanner();
        Parser parser = new Parser(scanner);
        Assembler assembler = new Assembler();
        Linker linker = new Linker();
        Compiler compiler = new Compiler(parser, assembler, linker);
        compiler.compile(sourceFile);
    }
}
