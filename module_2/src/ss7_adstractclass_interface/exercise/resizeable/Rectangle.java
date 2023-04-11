package ss7_adstractclass_interface.exercise.resizeable;

public class Rectangle implements Resizeable {
    private double width = 1.0;
    private double hight = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double hight) {
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
        return "Rectangle: " +
                "Width=" + width +
                ", Hight= " + hight +
                ", Area= " + getArea() +
                ", Primeter= " + getPrimeter();
    }
    @Override
    public void reisize(double percent) {
        setWidth(getWidth() + percent * getWidth() / 100);
        setHight(getHight() + percent * getHight() / 100);
    }
}
