package ss2_array_loop.exercise;


import java.util.Scanner;

public class PrimeNumberDisplay {

    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        int count2 = 0;
        Scanner length = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố: ");
        int n = Integer.parseInt(length.nextLine());
        while (count2 < n) {
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                    continue;
                }
            }
            if (count == 2) {
                System.out.print(prime + "\t");
                count2++;
            }
            prime++;
            count = 0;
        }

    }
}
