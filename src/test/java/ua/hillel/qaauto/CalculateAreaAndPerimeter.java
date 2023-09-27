package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class CalculateAreaAndPerimeter {

    @Test
    public void calculate1() {
        Rectangle rectangle = new Rectangle(1.22, 6.77);

        double area = rectangle.calculateArea();
        System.out.println("The rectangle Area is = " + area);
        }

    @Test
    public void calculate2(){
        Rectangle rectangle2 = new Rectangle(3,5);
        double perimeter = rectangle2.calculatePerimeter();
        System.out.println("The rectangle Perimeter is = " + perimeter);

    }
}