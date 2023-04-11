package ss6_inheritance.exercise.circlecylinder.testcircle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean su) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrimeter() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "CircleCylinder{" +
                "radius= " + radius +
                ", color= " + color + '\'' +
                "}" + ", Primeter= " + getPrimeter()
                ;
    }
}
