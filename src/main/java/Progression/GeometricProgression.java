package main.java.Progression;

public class GeometricProgression extends Progression {
    private int base;

    public GeometricProgression(){
        this(2);
    }

    public GeometricProgression(int base){
        this.base = base;
        first = curr = 1;
    }

    @Override
    public int nextValue(){
        curr *= base;
        return curr;
    }
}
