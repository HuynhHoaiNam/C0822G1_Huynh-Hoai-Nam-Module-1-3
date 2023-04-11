package ss2_array_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng1 ");
        size = Integer.parseInt(scanner.nextLine());
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào phần tử: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int size2;
        int[] arr2;
        System.out.print("Nhập vào độ dài mảng2 ");
        size2 = Integer.parseInt(scanner.nextLine());
        arr2 = new int[size2];
        for (int j = 0; j < arr2.length; j++) {
            System.out.print("Nhập vào phần tử: " + j);
            arr2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Hai mảng vừa nhập là: ");
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(arr2));
        int[] arr3;
        arr3 = new int[arr.length + arr2.length];
            for (int k = 0; k < arr.length; k++) {
                arr3[k] = arr[k];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[arr.length+i]=arr2[i];
        }
        System.out.print("\n"+"Một mảng mới là: ");
        System.out.print(Arrays.toString(arr3));
    }

}
