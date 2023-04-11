package ss3_method.exercise;


import java.util.Scanner;

public class SumInColumn {
    public static void main(String[] args) {
        int size;
        int size2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng: ");
        size = scanner.nextInt();
        System.out.print("Nhập vào số cột: ");
        size2 = scanner.nextInt();
        int[][] arr = new int[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("A[" + i + "," + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        int count;
        System.out.print("Nhập vào hàng muốn tính: ");
        count = scanner.nextInt();
        if (count > size) {
            System.out.print("Không có hàng này");
        } else if (count <= size) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][count - 1];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Tổng của hàng " + count + " là " + sum);

    }
}
