package ua.hillel.qaauto;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Adding int numbers = " + calculator.add(1, 1));
        System.out.println("Adding double numbers = " + calculator.add(1.23, 1.45));

        System.out.println("subtract int numbers = " + calculator.subtract(1, 1));
        System.out.println("subtract double numbers = " + calculator.subtract(1.23, 1.45));

        System.out.println("multiply int numbers = " + calculator.multiply(1, 1));
        System.out.println("multiply double numbers = " + calculator.multiply(1.23, 1.45));

        System.out.println("divide int numbers = " + calculator.subtract(1, 1));
        System.out.println("divide double numbers = " + calculator.subtract(1.23, 1.45));
    }

}
