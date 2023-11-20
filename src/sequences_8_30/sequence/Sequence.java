package sequences_8_30.sequence;

import java.util.ArrayList;

abstract public class Sequence {
    protected int max = 1000;
    protected ArrayList<Integer> sequence=new ArrayList<>();
    private String name;
    
    public Sequence(String name){
        this.name=name;
    }
    
    public void setMax(int max){
        this.max=max;
        sequence.clear();
        initialize();
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<Integer> getSequence(){
        return sequence;
    }

    @Override
    public String toString() {
        return "Sequence: "+name + " [max: "+max+"]";
    }
    
    abstract void initialize();
    
}





















