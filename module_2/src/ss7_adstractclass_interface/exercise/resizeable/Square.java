package ss7_adstractclass_interface.exercise.resizeable;

public class Square implements Resizeable {
    private double size = 5.0;
    private String color = "Red";

    public Square() {
    }


    public Square(double width, String color) {
        this.size = width;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.size * this.size;
    }

    public double getPrimeter() {
        return this.size * 4;
    }

    @Override
    public String toString() {
        return "Square: " +
                "Width= " + size +
                ", Color= " + color + '\'' +
                ", Arae= " + getArea() +
                ", Primeter= " + getPrimeter()
                ;
    }

    @Override
    public void reisize(double percent) {
        setSize(getSize() + percent * getSize() / 100);
    }
}
