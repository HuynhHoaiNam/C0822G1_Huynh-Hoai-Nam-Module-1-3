package ss15_debug.practice;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("CHƯƠNG TRÌNH GIẢI PHƯƠNG TRÌNH BẬC");
        System.out.println("Phương trình có dạng ax+b=0");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a:");
        double a = scanner.nextDouble();

        System.out.println("Nhập b:");
        double b = scanner.nextDouble();


        if (a != 0) {
            double solation = -b / a;
            System.out.println("Nghiệm của phương trình là: " + solation);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có nghiệm là x");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
