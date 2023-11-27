package sequences_8_30.exceptions;

public class OutOfBoundsException extends Exception {
    
    public OutOfBoundsException(String msg, int n){
        super("Argument [n="+n+"] exceeds the allowed range. " + msg);
    }
}
