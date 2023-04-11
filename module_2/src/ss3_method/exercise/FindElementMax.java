package ss3_method.exercise;


import java.util.Scanner;

public class FindElementMax {
    public static void main(String[] args) {
        int size;
        int size2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số mảng con");
        size = scanner.nextInt();
        System.out.print("Nhập vào số phần tử của mảng con");
        size2 = scanner.nextInt();
        int arr[][] = new int[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("A[" + i + "," + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất trong mảng 2 chiều là: " + max);

    }

}
