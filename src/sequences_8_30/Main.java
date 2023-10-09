/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequences_8_30;

/**
 *
 * @author xenon
 */
public class Main {

    final static int MAX = 50;
    final static int MAX_IN_LINE = 24;
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
    public static void main(String[] args) {
        for (int i = 1; i < MAX; i++) {
            System.out.print(i);
            if (i < MAX - 1) {
                System.out.print(", ");
            }
            if (getNumberOfDigits(i)<MAX_LENGTH){
                for (int j=0;j<MAX_LENGTH-getNumberOfDigits(i);j++){
                    System.out.print(" ");
                }
            }
            if (i % MAX_IN_LINE == 0) {
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }
}
