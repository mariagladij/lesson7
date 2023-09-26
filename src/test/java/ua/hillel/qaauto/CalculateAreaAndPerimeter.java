package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class CalculateAreaAndPerimeter {

    @Test
    public void calculateArea() {
        Rectangle calculateRectangleArea = new Rectangle();

        calculateRectangleArea.height = 4.55;
        calculateRectangleArea.width = 8.7;

        double rectangleArea = calculateRectangleArea.height * calculateRectangleArea.width;

        System.out.println("The rectangle Area is = " + rectangleArea);


        Rectangle calculateRectanglePerimeter = new Rectangle();

        calculateRectanglePerimeter.height = 4.55;
        calculateRectanglePerimeter.width = 8.7;

        double rectanglePerimeter = 2 * (calculateRectanglePerimeter.height + calculateRectanglePerimeter.width);
        System.out.println("The rectangle Perimeter is = " + rectanglePerimeter);

    }
}