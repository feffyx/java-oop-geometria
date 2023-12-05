package org.lessons.java.geometria;
class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());
        System.out.println(rectangle);
    }
}

public class Rectangle {
    double base, height;

    public Rectangle(double base, double height) {
        this.base = base >= 0 ? base : 0.0d;
        this.height = height >= 0 ? height : 0.0d;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getPerimeter() {
        return base * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
