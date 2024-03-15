// Static polymorphism example, Compile-time Binding/Early binding using Overloading methode
public class Calculation {
    // Overloading example

    public static int add(int a, int b) {
        return a + b;
    }

    public int add(Double c, int d) {
        int x = (int) c.doubleValue();
        return x + d;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public Double add(double a, double b) {
        return a + b;
    }
    public Double add(double a, double b, double c) {
        return a + b + c;
    }
}
