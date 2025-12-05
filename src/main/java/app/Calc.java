package app;

public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Dodawanie: " + Calc.add(5, 3));
        System.out.println("Odejmowanie: " + Calc.subtract(5, 3));
    }
}
