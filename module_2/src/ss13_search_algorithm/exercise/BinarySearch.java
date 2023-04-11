package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int key, int low, int hight) {
        if (hight >= low) {
            int mid = (low + hight) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                return binarySearch(arr, key, low, mid - 1);
            }
            return binarySearch(arr, key, mid + 1, hight);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm:");
        int value = Integer.parseInt(scanner.nextLine());
        int[] arr = {1, 3, 11, 10, 15, 18, 26, 2, 43, 5, 67};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        int index = binarySearch(arr, value, 0, arr.length - 1);
        System.out.println("Giá trị cần tìm tại index = " + index);
    }
}
