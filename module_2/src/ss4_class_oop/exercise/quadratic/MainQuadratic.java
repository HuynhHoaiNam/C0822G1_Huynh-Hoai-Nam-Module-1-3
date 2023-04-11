package ss4_class_oop.exercise.quadratic;

import java.util.Scanner;

public class MainQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào c: ");
        double c = scanner.nextDouble();
        Quadratic quadratic = new Quadratic(a, b, c);
        System.out.print(quadratic.display());
        if (quadratic.getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm kép là: " + quadratic.getRoot1());
        } else if (quadratic.getDiscriminant() > 0) {
            System.out.print("\n" + "Phương trình có hai nghiệm:" + "\n");
            System.out.print("Nghiệm 1= " + quadratic.getRoot1() + "\n");
            System.out.print("Nghiệm 2= " + quadratic.getRoot2());
        } else {
            System.out.print("\n" + "Phương trình vô nghiệm:");
        }
    }
}
