package ss6_inheritance.exercise.point2dandpoint3d.point3d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Nhập x: " );
        float x = scanner.nextFloat();
        System.out.print("Nhập y: " );
        float y = scanner.nextFloat();
        System.out.print("Nhập z: " );
        float z = scanner.nextFloat();
        Point3d point3d = new Point3d(x, y, z);
        System.out.print(point3d);

    }
}
