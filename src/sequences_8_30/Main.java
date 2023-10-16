
package sequences_8_30;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xenon
 */
public class Main {

    final static int MAX = 200;
    final static int MAX_IN_LINE = 16;
    final static int MAX_LENGTH=getNumberOfDigits(MAX);

    private static int getNumberOfDigits(int n){
        int nd=0;
        while(n>0){
            nd++;
            n=(n-(n % 10))/10;
        }
        return nd;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        FileWriter myWriter=null;
        try {
               myWriter = new FileWriter("output/integers.txt");  
            //myWriter.write("Files in Java might be tricky, but it is fun enough!");
            //myWriter.close();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
      
        
        for (int i = 1; i < MAX; i++) {
            myWriter.write(Integer.toString(i));
            if (i < MAX - 1) {
                myWriter.write(", ");
            }
            if (getNumberOfDigits(i)<MAX_LENGTH){
                for (int j=0;j<MAX_LENGTH-getNumberOfDigits(i);j++){
                    myWriter.write(" ");
                }
            }
            if (i % MAX_IN_LINE == 0) {
                myWriter.write("\n");
            }
        }
        myWriter.write("\n");
        myWriter.close();
    }
}
