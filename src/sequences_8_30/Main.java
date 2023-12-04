package sequences_8_30;

import sequences_8_30.exceptions.CantDecomposeException;
import sequences_8_30.exceptions.OutOfBoundsException;
import sequences_8_30.gui.MainFrame;
import sequences_8_30.print.Printer;
import sequences_8_30.print.PrinterFile;
import sequences_8_30.print.PrinterStdOut;
import sequences_8_30.sequence.Arithmetic;
import sequences_8_30.sequence.Fibonacci;
import sequences_8_30.sequence.Integers;
import sequences_8_30.sequence.Primes;
import sequences_8_30.sequence.Sequence;
import sequences_8_30.sequence.Squares;

public class Main {

    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
        
        Printer printerStdOut = new PrinterStdOut();
        Printer printerFile = new PrinterFile("integers.txt");

        Sequence sq = new Integers();
        printerStdOut.print(sq);
        printerFile.print(sq);

        sq = new Arithmetic(3, 5);
        printerStdOut.print(sq);
        printerFile.print(sq);

        try {
            System.out.println(sq.getSum(10));

            sq = new Fibonacci(3, 5);
            printerStdOut.print(sq);
            printerFile.print(sq);

            //System.out.println(sq.getSum(30));

            sq = new Squares();
            printerStdOut.print(sq);
            printerFile.print(sq);

            System.out.println(sq.getDecomposition(1236));

            sq = new Primes();
            sq.setMax(10000);
            printerStdOut.print(sq);
            printerFile.print(sq);

            System.out.println(sq.getDecomposition(30));

            sq = new Fibonacci();
            printerStdOut.print(sq);
            printerFile.print(sq);

            System.out.println(sq.getDecomposition(666));

            sq = new Integers();
            printerStdOut.print(sq);
            printerFile.print(sq);

        } catch (OutOfBoundsException|CantDecomposeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
