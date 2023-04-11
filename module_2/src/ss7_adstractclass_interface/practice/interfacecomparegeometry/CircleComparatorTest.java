package ss7_adstractclass_interface.practice.interfacecomparegeometry;

import ss6_inheritance.exercise.circlecylinder.testcircle.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.2, "red", true);
        circles[1] = new Circle(2.3, "blue", true);
        circles[2] = new Circle(3.5, "indigo", true);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
