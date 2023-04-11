package furamaresort.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() throws Exception {
        while (true) {
            System.out.println("*************CHƯƠNG TRÌNH QUẢN LÝ FUARAMA REORT*************");
            System.out.println("1: Quản lý nhân sự:");
            System.out.println("2: Quản lý khách hàng:");
            System.out.println("3: Quản lý cơ sở:");
            System.out.println("4: Quản lý đặt chỗ:");
            System.out.println("5: Quản lý quảng cáo:");
            System.out.println("6: Thoát chương trình:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    EmployeeController.employeeMenu();
                    break;
                case "2":
                    Customercontroller.customerMenu();
                    break;
                case "3":
                    FacilityController.facilityMenu();
                    break;
                case "4":
                    BookingController.bookingMenu();
                    break;
                case "5":

                    break;
                case "6":
                    System.exit(0);
//                    return;
                default:
                    System.out.println("Không có lựa chọn này. Mời nhập lại:");
            }
        }
    }
}
