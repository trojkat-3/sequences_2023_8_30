package sequences_8_30.sequence;

import java.util.ArrayList;

public class Fibonacci extends Sequence{
    
    public Fibonacci(){
        super("Fibonacci numbers");
    }
    
     private int Fibonacci(int n, ArrayList<Integer> list) {
        if (n <= 1) {
            return n;
        } else if (n < list.size()) {
            return list.get(n);
        } else {
            return Fibonacci(n - 2, list) + Fibonacci(n - 1, list);
        }
    }

    @Override
    void initialize() {
        int i=0;
        int fib;
        while ( (fib=Fibonacci(i, sequence))<=max ){
            sequence.add(fib);
            i++;
        }
    }    
    
}
