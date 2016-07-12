package templateMethod.aufgabe1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by edutilos on 12.07.2016.
 */
public class DerivatHandler extends DatenHandler {
    @Override
    public boolean isValidFileType(String filename) {
        return filename.endsWith(".txt");
    }

    @Override
    public DatenObjekt transformData(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line , "|");
            /*
                private String name;
    private int maxWert;
    private int minWert;
    private int eroeffnungsWert;
    private  int schlusswert;
             */
            String name = tokenizer.nextToken();
            int maxWert = Integer.parseInt(tokenizer.nextToken());
            int minWert = Integer.parseInt(tokenizer.nextToken());
            int eroeffnungsWert = Integer.parseInt(tokenizer.nextToken());
            int schlusswert = Integer.parseInt(tokenizer.nextToken());
            DatenObjekt obj = new DatenObjekt(name, maxWert , minWert, eroeffnungsWert, schlusswert);
            return obj ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void writeToDB(DatenObjekt obj) {
       SqliteWriter writer = new SqliteWriter("derivat.db", true);
        writer.connect();
        writer.insertEntry(obj);
        writer.disconnect();
    }
}
