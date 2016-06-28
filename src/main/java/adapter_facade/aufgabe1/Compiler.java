package adapter_facade.aufgabe1;

/**
 * Created by edutilos on 28.06.2016.
 */
public class Compiler {
    private Parser parser ;
    private Assembler assembler;
    private Linker linker ;

    public Compiler(Parser parser, Assembler assembler, Linker linker) {
        this.parser = parser;
        this.assembler = assembler;
        this.linker = linker;
    }

    private void compileInternal(String sourceFile) {
        parser.parse(sourceFile);
        System.out.println("internal compiling was completed.");
    }

    public void compile(String sourceFile) {
        compileInternal(sourceFile);
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
    }
}
