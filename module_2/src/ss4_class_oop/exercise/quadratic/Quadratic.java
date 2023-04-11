package ss4_class_oop.exercise.quadratic;

public class Quadratic {
    double a;
    double b;
    double c;

    public Quadratic() {
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = (this.b * this.b) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public String display() {
        return "a=" + a + "; b=" + b + "; c=" + c;
    }


}
