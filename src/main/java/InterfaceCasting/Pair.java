package main.java.InterfaceCasting;

public class Pair <K, V>{
    K key;
    V value;
    public void set(K k, V v){
        key = k;
        value = v;
    }

    public K getKey() { return key;}
    public V getValue(){return value;}

    public String toString(){
        return "["+getKey() + ", " + getValue() + "]";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>();
        pair1.set(new String("Height"), new Integer(20));
        System.out.println(pair1);
        Pair<Student, Double> pair2 = new Pair<Student, Double>();
        pair2.set(new Student("A010203", "Mihkel", 28), new Double(5.0));
        System.out.println(pair2.toString());
    }
}
