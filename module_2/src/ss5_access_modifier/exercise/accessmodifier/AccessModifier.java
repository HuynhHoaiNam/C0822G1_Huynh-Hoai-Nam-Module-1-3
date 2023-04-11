package ss5_access_modifier.exercise.accessmodifier;

public class AccessModifier {
    private double radius = 1.0;
    private String collor = "red";

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public AccessModifier() {
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }

}
