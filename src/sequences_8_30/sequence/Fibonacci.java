package sequences_8_30.sequence;

import java.util.ArrayList;

public class Fibonacci extends Sequence{
    
    public Fibonacci(){
        super("Fibonacci numbers");
        initialize();
    }
    
     private int fibonacci(int n, ArrayList<Integer> list) {
        if (n <= 1) {
            return n;
        } else if (n < list.size()) {
            return list.get(n);
        } else {
            return fibonacci(n - 2, list) + fibonacci(n - 1, list);
        }
    }

    @Override
    void initialize() {
        int i=0;
        int fib;
        while ( (fib=fibonacci(i, sequence))<=max ){
            sequence.add(fib);
            i++;
        }
    }    
    
}
