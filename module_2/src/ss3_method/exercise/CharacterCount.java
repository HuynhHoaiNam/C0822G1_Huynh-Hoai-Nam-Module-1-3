package ss3_method.exercise;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "hoianam";
        char[] arr = str.toCharArray();
        System.out.println("Nhập vào 1 ký tự: ");
        char c;
        c = scanner.nextLine().charAt(0);
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                count++;
                index = i;
                System.out.println(c + " xuất hiện tại vị trí " + index);
            }

        }
        if (count == 0) {
            System.out.print("Không có kí tự " + c + "\n");
        }

        System.out.print("Số lần xuất hiện của là: " + count);
    }

}