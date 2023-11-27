package sequences_8_30.sequence;

import java.util.ArrayList;
import sequences_8_30.exceptions.OutOfBoundsException;

abstract public class Sequence {

    protected int max = 1000;
    protected ArrayList<Integer> sequence = new ArrayList<>();
    private String name;

    public Sequence(String name) {
        this.name = name;
    }

    public void setMax(int max) {
        this.max = max;
        sequence.clear();
        initialize();
    }

    /**
     * Computes the sum of n initial elements of the sequence
     *
     * @param n
     * @return sum of n initial elements
     * @throws OutOfBoundsException
     */
    public int getSum(int n) throws OutOfBoundsException {
        if (n>sequence.size()){
            throw new OutOfBoundsException("In the sum function for "+name+
                    " seqence max="+sequence.size(),n);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sequence.get(i);
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return "Sequence: " + name + " [max: " + max + "]";
    }

    abstract void initialize();

}
