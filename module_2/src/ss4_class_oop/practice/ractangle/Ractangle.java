package ss4_class_oop.practice.ractangle;



public class Ractangle {
    double width, height;

    public Ractangle() {
    }

    public Ractangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPrimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{ " + "Chiều dài=" + width + ", chiều rộng=" + height + " }";
    }
}