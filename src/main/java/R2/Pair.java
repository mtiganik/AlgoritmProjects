package main.java.R2;

public class Pair<F,S> {
    private F first;
    private S second;

    public Pair(F first, S second){
        setValues(first, second);
    }

    public void setValues(F first, S second){
        this.first = first;
        this.second = second;
    }

    public String getFirst(){
        return this.first.toString();
    }

    public String getSecond(){
        return this.second.toString();
    }

    @Override
    public String toString(){
        return "first: " + getFirst() + ", second: " + getSecond();
    }

    public static void main(String[] args) {
        Pair<Integer, String>  c = new Pair(3, "Hello");
        Pair<Float, Long> b = new Pair(4.55, 123043);
        System.out.println(c.toString());
        System.out.println(b.toString());
    }
}
