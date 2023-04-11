package ss7_adstractclass_interface.exercise.colorable;

public class Square implements Colorable {
    private double width = 5.0;
    private String color = "Red";

    public Square() {
    }

    public Square(double width, String color) {
        this.width = width;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public double getPrimeter() {
        return this.width * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
