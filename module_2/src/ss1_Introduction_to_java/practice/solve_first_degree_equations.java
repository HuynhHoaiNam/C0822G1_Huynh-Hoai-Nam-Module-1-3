package ss1_Introduction_to_java.practice;

import java.util.Scanner;

public class solve_first_degree_equations {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất");
        System.out.println("cho phương trình có dạng 'a*x+b=c'nhập một hằng số");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
