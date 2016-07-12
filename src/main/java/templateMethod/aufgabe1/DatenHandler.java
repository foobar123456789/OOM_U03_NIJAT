package templateMethod.aufgabe1;

/**
 * Created by edutilos on 12.07.2016.
 */
public abstract class DatenHandler {
 public void execute(String filename) {
     if(!isValidFileType(filename)) {
         System.err.println(filename + " is not valid file type");
     } else {
         DatenObjekt obj = transformData(filename);
         writeToDB(obj);
     }
 }

    public abstract boolean isValidFileType(String filename) ;
    public abstract DatenObjekt transformData(String filename);
    public abstract void writeToDB(DatenObjekt obj);
}
