package furamaresort.controllers;

import java.util.Scanner;

public class PromotionController {
    public static void promotionMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Display list customers use service");
            System.out.println("Display list customers get voucher");
            System.out.println("Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 6:
                    return;
            }
        }
    }
}
