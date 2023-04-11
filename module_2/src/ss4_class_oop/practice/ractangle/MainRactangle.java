package ss4_class_oop.practice.ractangle;

import java.util.Scanner;

public class MainRactangle {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chiều dài: ");
            double width = scanner.nextDouble();
            System.out.print("Nhập chiều rộng: ");
            double height = scanner.nextDouble();
            Ractangle ractangle = new Ractangle(width, height);
            System.out.print("" + ractangle.display());
            System.out.print("\n" + "Diện tích là: " + ractangle.getArea() + "\n");
            System.out.print("Chu vi là: " + ractangle.getPrimeter());
    }
}
