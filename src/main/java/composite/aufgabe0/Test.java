package composite.aufgabe0;

import java.util.Random;

/**
 * Created by edutilos on 19.07.2016.
 */
public class Test {
    static Random rand = new Random();
    private static int generateRandom() {
        int High = 200 , Low = 0 ; 
        return rand.nextInt(High- Low) + Low ; 
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Directory root , par1 , par2 ;
        File f11 , f12 ,f13, f21, f22 ;
        f11 = new File("File11", generateRandom());
        f12 = new File("File12", generateRandom());
        f13 = new File("File13", generateRandom());
        f21 = new File("File21", generateRandom());
        f22 = new File("File22", generateRandom());
        root = new Directory("Root");
        par1 =  new Directory("Parent1");
        par2 = new Directory("Parent2");
        root.add(par1);
        root.add(par2);
        par1.add(f11); par1.add(f12); par1.add(f13);
        par2.add(f21); par2.add(f22);


        Directory par11 = new Directory("Parent11");
        File f111 = new File("File111", generateRandom());
        par11.add(f111);
        par1.add(par11);
        root.print();

        System.out.println("Size = "+ root.getSize());
        
    }
}
