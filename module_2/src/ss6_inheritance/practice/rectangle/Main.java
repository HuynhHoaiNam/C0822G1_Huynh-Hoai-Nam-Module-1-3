package ss6_inheritance.practice.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle("red", false, 5.3, 6.1);
        System.out.print(rectangle);
    }
}
