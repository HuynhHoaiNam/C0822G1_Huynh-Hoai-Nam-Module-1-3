package ss2_array_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử: " + i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập vào số muốn xoá");
        int check = scanner.nextInt();
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (check == array[j]) {
                index = j;
                for (int i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = 0;
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
