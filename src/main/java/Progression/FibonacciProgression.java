package main.java.Progression;

public class FibonacciProgression extends Progression {
    private int prev;

    public FibonacciProgression(){
        this(0,1);
    }

    public FibonacciProgression(int firstValue, int secondValue){
        this.first = firstValue;
        this.prev = secondValue - firstValue;
    }

    public int nextValue(){
        int temp = prev;
        prev = curr;
        curr += temp;
        return curr;
    }
}
