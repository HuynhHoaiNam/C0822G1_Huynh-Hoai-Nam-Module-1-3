package ss4_class_oop.exercise.fanclass;

public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean on;
    double radius = 5;
    String color = "blue";

    public FanClass() {
//        this.speed = speed;
//        this.on = on;
//        this.radius = radius;
//        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String display() {
        return "tốc độ " + getSpeed() + ", kích thước " + getRadius() + ", màu sắc " + getColor();
    }

    public String display2() {
        return  ", kích thước " + getRadius() + ", màu sắc " + getColor();
    }
}
