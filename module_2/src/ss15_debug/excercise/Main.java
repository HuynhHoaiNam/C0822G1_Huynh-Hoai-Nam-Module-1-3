package ss15_debug.excercise;

import java.util.Scanner;

public class Main {

    public static class CheckIllegalTriangle {
        public void checkTrianggle(double a, double b, double c) throws CheckIllegalTriangleException {

            if (a + b < c || a + c < b || b + c < a) {
                throw new CheckIllegalTriangleException("Cạnh không hợp lệ");
            } else {
                System.out.print("\nChuẩn tam giác");
            }
        }

        public void checkTrianggle2(double n) throws CheckIllegalTriangleException {
            if (n < 0) {
                throw new CheckIllegalTriangleException("Cạnh không hợp lệ");
            } else {
                System.out.print("Cạnh hợp lệ");
            }
        }
    }


    public static void main(String[] args) {

        CheckIllegalTriangle checkIllegalTriangle = new CheckIllegalTriangle();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double a;
            double b;
            double c;
            while (true) {
                try {
                    System.out.print("Nhập cạnh a: ");
                    a = Double.parseDouble(scanner.nextLine());
                    checkIllegalTriangle.checkTrianggle2(a);
                    break;
                } catch (CheckIllegalTriangleException e) {
                    System.out.print(e.getMessage());
                }
            }
            while (true) {
                try {
                    System.out.println("\nNhập cạnh b: ");
                    b = Double.parseDouble(scanner.nextLine());
                    checkIllegalTriangle.checkTrianggle2(b);
                    break;
                } catch (CheckIllegalTriangleException e) {
                    System.out.print(e.getMessage());
                    System.out.println("\nNhập lại cạnh b");
                }

            }
            while (true) {
                try {
                    System.out.println("\nNhập cạnh c: ");
                    c = Double.parseDouble(scanner.nextLine());
                    checkIllegalTriangle.checkTrianggle2(c);
                    break;
                } catch (CheckIllegalTriangleException e) {
                    System.out.print(e.getMessage());
                    System.out.print("\nNhập lại cạnh c");

                }

            }
            try {
                checkIllegalTriangle.checkTrianggle(a, b, c);
                break;
            } catch (CheckIllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

