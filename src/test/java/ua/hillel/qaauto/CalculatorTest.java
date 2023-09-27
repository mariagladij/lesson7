package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void calculateDouble() {
        Calculator calculator= new Calculator();

        System.out.println("Adding int numbers = " + calculator.add(16, 13));
        System.out.println("Adding double numbers = " + calculator.add(1.23, 1.45));

        System.out.println("subtract int numbers = " + calculator.subtract(41, 91));
        System.out.println("subtract double numbers = " + calculator.subtract(1.23, 1.45));

        System.out.println("multiply int numbers = " + calculator.multiply(11, 51));
        System.out.println("multiply double numbers = " + calculator.multiply(1.23, 1.45));

        System.out.println("divide int numbers = " + calculator.subtract(11, 61));
        System.out.println("divide double numbers = " + calculator.subtract(1.23, 1.45));

    }
}