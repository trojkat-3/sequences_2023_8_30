package sequences_8_30;

import java.util.ArrayList;
import sequences_8_30.print.IntegersPrinter;

/**
 *
 * @author xenon
 *
 */
public class Main {

    final static int MAX = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //integers
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        IntegersPrinter.printIntegers(list);
        //squares
        list.clear();
        for (int i = 1; i*i <= MAX; i++) {
            list.add(i*i);
        }
        IntegersPrinter.printIntegers(list);
    }
}




















