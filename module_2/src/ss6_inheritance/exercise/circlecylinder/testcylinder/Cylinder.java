package ss6_inheritance.exercise.circlecylinder.testcylinder;

import ss6_inheritance.practice.circle.Circle;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, boolean filled, double hight) {
        super(radius, color, filled);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getVolume() {
        return Math.PI * super.getRadius() * hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight= " + hight +
                ", radius= " + super.getRadius() +
                ", area= " + super.getArea() +
                ", volume= " + getVolume() +
                '}';
    }
}
