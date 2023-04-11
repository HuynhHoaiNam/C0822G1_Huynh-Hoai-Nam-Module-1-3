package ss1_Introduction_to_java.exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.print("Xin chào:" + name);
    }
}
