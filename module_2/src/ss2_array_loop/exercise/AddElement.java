package ss2_array_loop.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
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
        System.out.print("Nhập vào số muốn thêm: ");
        int numberadd = scanner.nextInt();
        System.out.print("Nhập vào vị trí muốn thêm: ");
        int indexadd = scanner.nextInt();
        if (indexadd < 0 || indexadd > array.length - 1) {
            System.out.print("Không hiển thị được");

        } else {
            for (int j = array.length - 1; j > indexadd; j--) {
                array[j] = array[j - 1];
            }
            array[indexadd] = numberadd;
            System.out.println("Mảng đã thêm là: " + Arrays.toString(array));
        }
    }

}