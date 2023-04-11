package ss3_method.exercise;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        size = scanner.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("A[" + i + "]");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất trong mảng là: " + min);
    }

}
