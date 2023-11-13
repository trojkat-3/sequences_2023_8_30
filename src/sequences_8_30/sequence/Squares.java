package sequences_8_30.sequence;


public class Squares extends Sequence{
    
    public Squares(){
        super("Squares");
    }

    @Override
    void initialize() {
        for (int i = 1; i * i <= max; i++) {
            sequence.add(i * i);
        }
    }
    
}
