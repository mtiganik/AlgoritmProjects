package main.java.Progression;

public class MainApp {
    public static void main(String[] args) {
        ArithmeticProgression a = new ArithmeticProgression();
        System.out.println("Aritmetics values:");
        a.printValues(4);

        GeometricProgression g = new GeometricProgression();
        System.out.println("Geometric values:");
        g.printValues(4);

        FibonacciProgression f = new FibonacciProgression(4,6);
        System.out.println("Fibonacci values");
        f.printValues(8);

        System.out.println("casting Geometric progression");
        Progression p = new GeometricProgression();
        ((ArithmeticProgression)p).PrintArithmeticHello();
    }
}
