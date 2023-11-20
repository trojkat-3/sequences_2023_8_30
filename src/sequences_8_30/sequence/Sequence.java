package sequences_8_30.sequence;

import java.util.ArrayList;

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
     */
    public int getSum(int n) throws Exception {
        if (n>sequence.size()){
            throw new Exception("In the sum function "+n
                    +" is to large, max: "+sequence.size());
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
