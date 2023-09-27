package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class CalculateAreaAndPerimeter {

    @Test
    public void calculate1() {
        Rectangle rectangle = new Rectangle();

        rectangle.RectangleHeight(3.22);
        rectangle.RectangleWidth(4.89);

        double area = rectangle.calculateArea();
        System.out.println("The rectangle Area is = " + area);
    }

    @Test
    public void calculate2(){
        Rectangle rectangle2 = new Rectangle();

        rectangle2.RectangleHeight(34.55);
        rectangle2.RectangleWidth(20.00);

        double perimeter = rectangle2.calculatePerimeter();
        System.out.println("The rectangle Perimeter is = " + perimeter);

    }
}
