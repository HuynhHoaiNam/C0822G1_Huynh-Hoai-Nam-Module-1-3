package ss1_Introduction_to_java.practice;

import java.util.Scanner;

public class number_of_days_in_the_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("tháng " + month + " có 30 ngày");
                break;
            case 2:
                System.out.print("tháng 2 có 28 hoặc 29 ngày");
        }
    }
}
