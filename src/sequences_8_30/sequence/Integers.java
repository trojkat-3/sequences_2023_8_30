package sequences_8_30.sequence;

public class Integers extends Sequence {
    
    public Integers(){
        super("Integers");
    }

    @Override
    void initialize() {
        for (int i = 1; i <= max; i++) {
            sequence.add(i);
        }
    }
}
