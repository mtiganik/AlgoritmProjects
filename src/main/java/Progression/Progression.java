package main.java.Progression;

public class Progression {
    protected int first;
    protected int curr;

    Progression(){
        curr = first = 0;

    }

    public int firstValue(){
        curr = first;
        return curr;
    }

    public int nextValue(){
        return ++curr;
    }

    public void printValues(int n){
        for(int i = 0; i < n; i++){
            System.out.println(nextValue());
        }
    }
}
