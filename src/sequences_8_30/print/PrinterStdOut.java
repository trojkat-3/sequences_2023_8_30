package sequences_8_30.print;

public class PrinterStdOut extends Printer {

    @Override
    protected void output(String str) {
        System.out.println(str);
    }
    
}
