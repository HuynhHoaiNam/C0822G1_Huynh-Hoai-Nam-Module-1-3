package ss1_Introduction_to_java.exercise;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        double VND = 230000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD");
        double USD = scanner.nextDouble();
        double ketqua = USD * 230000;
        System.out.print("Giá trị VND là: " + ketqua);
    }
}
