package ss6_inheritance.practice.shape;


public class Main {
    public static void main(String[] args) {
        GeometricObject geometricObject = new GeometricObject();
        geometricObject = new GeometricObject("red", false);
        System.out.print(geometricObject);
    }
}
