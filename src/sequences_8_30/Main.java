package sequences_8_30;

import java.util.ArrayList;
import sequences_8_30.print.IntegersPrinter;
import sequences_8_30.sequence.Integers;
import sequences_8_30.sequence.Sequence;

public class Main {

    

   

   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        IntegersPrinter printerStdOut = new IntegersPrinter();
        IntegersPrinter printerFile = new IntegersPrinter("integers.txt");
   
        //integers
        
        printerStdOut.print(list, "Integers");
        //squares
        list.clear();
        
        printerFile.print(list, "Squares");
        //primes
        list.clear();
        
        printerFile.print(list, "Primes");
        //Fibonacci
        list.clear();
        
        printerStdOut.print(list,"Fibonacci numbers");
        printerFile.print(list,"Fibonacci numbers"); 
    }
}
