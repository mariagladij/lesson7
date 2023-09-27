package ua.hillel.qaauto;

public class Rectangle {

    //властивості прямокутника
    double width;
    double height;

    //конструктор для створенння прямокутника
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //метод для обчислення периметру прямокутника
    double calculatePerimeter(){
        return width * height;
    }

    //метод для обчислення площі прямокутника
    double calculateArea(){
        return 2 * (width + height);
    }

}


