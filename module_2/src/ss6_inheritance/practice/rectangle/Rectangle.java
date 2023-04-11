package ss6_inheritance.practice.rectangle;

import ss6_inheritance.practice.shape.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width = 1.0;
    private double hight = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public Rectangle(String color, boolean filled, double width, double hight) {
        super(color, filled);
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getArea() {
        return this.hight * width;
    }

    public double getPrimeter() {
        return 2 * (this.hight * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", hight=" + hight +
                '}' + ", area= " + getArea() +
                ", primeter= " + getPrimeter();
    }
}
