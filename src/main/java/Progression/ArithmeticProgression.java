package main.java.Progression;

public class ArithmeticProgression extends Progression {

    protected int step;

    public ArithmeticProgression(){
        this(1);
    }

    public ArithmeticProgression( int step){
        this.step = step;
    }

    @Override
    public int nextValue(){
        curr += step;
        return curr;
    }

    public void PrintArithmeticHello(){
        System.out.println("Arithmetic method");
    }


}
