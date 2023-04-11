package ss5_access_modifier.exercise.accessmodifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bán kính hình tròn: ");
        AccessModifier accessModifier = new AccessModifier(scanner.nextDouble());
        System.out.print("Bán kính vừa nhập là: " + accessModifier.getRadius()+"\n");
        System.out.print("Diện tích hình tròn là: " + accessModifier.getArea());
    }
}
