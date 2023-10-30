package sequences_8_30.print;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author xenon
 */
public class IntegersPrinter {
    final static int MAX_IN_LINE = 16;
    final static boolean WRITE_TO_FILE = true;
    
    private static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - (n % 10)) / 10;
        }
        return nd;
    }
    
    public static void printIntegers(ArrayList<Integer> listToOutput){
        String output = "";
        for (int i = 0; i < listToOutput.size() ; i++) {
            int n=listToOutput.get(i);
            output += Integer.toString(n);
            if (i < listToOutput.size() - 1) {
                output += ", ";
            }
            int maxNumber=Collections.max(listToOutput);
            for (int j = 0; j < 
                    getNumberOfDigits(maxNumber) - getNumberOfDigits(n); j++) {
                output += " ";
            }
            if ((i+1) % MAX_IN_LINE == 0) {
                output += "\n";
            }
        }
        output += "\n";
        if (WRITE_TO_FILE) {
            try (FileWriter myWriter = new FileWriter("output/integers.txt");) {
                myWriter.write(output);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println(output);
        }
    }
     
}
