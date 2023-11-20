package sequences_8_30;

import sequences_8_30.print.IntegersPrinter;
import sequences_8_30.sequence.Arithmetic;
import sequences_8_30.sequence.Fibonacci;
import sequences_8_30.sequence.Integers;
import sequences_8_30.sequence.Primes;
import sequences_8_30.sequence.Sequence;
import sequences_8_30.sequence.Squares;

public class Main { 
   
      public static void main(String[] args) {    
        IntegersPrinter printerStdOut = new IntegersPrinter();
        IntegersPrinter printerFile = new IntegersPrinter("integers.txt");
        
        Sequence sq=new Integers();
        printerStdOut.print(sq);
        printerFile.print(sq);
        
        sq=new Arithmetic(3,5);
        printerStdOut.print(sq);
        printerFile.print(sq);
        
        System.out.println(sq.getSum(10));
        
        sq=new Fibonacci(3,5);
        printerStdOut.print(sq);
        printerFile.print(sq);
        
          System.out.println(sq.getSum(30));
   
        sq=new Squares();
        printerStdOut.print(sq);
        printerFile.print(sq);
   
        sq=new Primes();
        sq.setMax(10000);
        printerStdOut.print(sq);
        printerFile.print(sq);
   
        sq=new Fibonacci();
        printerStdOut.print(sq);
        printerFile.print(sq);
        
    }
}
