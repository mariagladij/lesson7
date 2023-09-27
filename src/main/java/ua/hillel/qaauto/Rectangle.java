package ua.hillel.qaauto;

public class Rectangle {

    //властивості прямокутника
    double width;
    double height;

    //конструктор для створенння прямокутника
    void RectangleWidth(double width) {
        this.width = width;
    }
    void RectangleHeight(double height) {
        this.height = height;
    }

    //метод для обчислення периметру прямокутника
    double calculatePerimeter() {
        return width * height;
    }

    //метод для обчислення площі прямокутника
    double calculateArea() {
        return 2 * (width + height);
    }

}

