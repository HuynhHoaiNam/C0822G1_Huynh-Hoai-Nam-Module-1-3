package ss7_adstractclass_interface.exercise.resizeable;

public class Circle implements Resizeable {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double v, String indigo, boolean b) {
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
        return "CircleCylinder: " +
                "Radius= " + radius +
                ", Color= " + color + '\'' +
                ", Primeter= " + getPrimeter()
                ;
    }

    @Override
    public void reisize(double percent) {
        setRadius(getRadius() + percent * getRadius() / 100);
    }
}
