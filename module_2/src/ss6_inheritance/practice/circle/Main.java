package ss6_inheritance.practice.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.print(circle);

        circle = new Circle(3.5);
        System.out.print(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.print(circle);
    }
}
