package sequences_8_30;

import java.util.ArrayList;
import sequences_8_30.print.IntegersPrinter;

/**
 *
 * @author xenon
 *
 */
public class Main {

    final static int MAX = 10000;
    
    private static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    
    private static int Fibonacci(int n){
        if (n<=1){
            return n;
        } else {
            return Fibonacci(n-2)+Fibonacci(n-1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Fibonacci(20));
        IntegersPrinter printerStdOut=new IntegersPrinter();
        IntegersPrinter printerFile=new IntegersPrinter("integers.txt");
        
        ArrayList<Integer> list=new ArrayList<>();
        //integers
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        printerStdOut.print(list);
        //squares
        list.clear();
        for (int i = 1; i*i <= MAX; i++) {
            list.add(i*i);
        }
        printerFile.print(list);
        //primes
        list.clear();
        for (int i = 1; i <= MAX; i++) {
            if (isPrime(i)){
                list.add(i);   
            }
        }
        printerFile.print(list);
        //Fibonacci
    }
}




















