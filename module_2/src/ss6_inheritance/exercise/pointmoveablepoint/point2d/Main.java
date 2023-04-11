package ss6_inheritance.exercise.pointmoveablepoint.point2d;

import ss6_inheritance.exercise.point2dandpoint3d.point3d.Point3d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        float x = scanner.nextFloat();
        System.out.print("Nhập y: ");
        float y = scanner.nextFloat();
        Point2d point2d = new Point2d(x, y);
        System.out.print(point2d);
    }
}
