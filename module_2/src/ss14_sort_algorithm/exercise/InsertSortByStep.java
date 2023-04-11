package ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi sắp xếp: \n" + Arrays.toString(arr));

        insertSortByStep(arr);
        System.out.println("\nMảng sau khi sắp xếp: \n"+Arrays.toString(arr));
    }

    public static void insertSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
