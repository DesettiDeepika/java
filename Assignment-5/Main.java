class Calculator {

    // ---------- ADD Methods ----------
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // ---------- SUBTRACT Methods ----------
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // ---------- MULTIPLY Methods ----------
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // ---------- DIVIDE Methods ----------
    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    int divide(int a, int b, int c) {
        return a / b / c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing with two integers
        System.out.println("Add (int): " + calc.add(10, 5));
        System.out.println("Subtract (int): " + calc.subtract(10, 5));
        System.out.println("Multiply (int): " + calc.multiply(10, 5));
        System.out.println("Divide (int): " + calc.divide(10, 5));

        // Testing with two doubles
        System.out.println("Add (double): " + calc.add(10.5, 5.5));
        System.out.println("Subtract (double): " + calc.subtract(10.5, 5.5));
        System.out.println("Multiply (double): " + calc.multiply(10.5, 5.5));
        System.out.println("Divide (double): " + calc.divide(10.5, 5.5));

        // Testing with three integers
        System.out.println("Add (3 int): " + calc.add(10, 5, 2));
        System.out.println("Subtract (3 int): " + calc.subtract(10, 5, 2));
        System.out.println("Multiply (3 int): " + calc.multiply(10, 5, 2));
        System.out.println("Divide (3 int): " + calc.divide(100, 5, 2));
    }
}
