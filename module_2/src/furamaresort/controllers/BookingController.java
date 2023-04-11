package furamaresort.controllers;

import furamaresort.services.IBookingService;
import furamaresort.services.impl.BookingServiceImpl;

import java.util.Scanner;

public class BookingController {
    public static void bookingMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        IBookingService iBookingService = new BookingServiceImpl();
        while (true) {
            System.out.println("1. Thêm mới đăt chỗ");
            System.out.println("2. Hiển thị danh sách đặt chỗ");
            System.out.println("3. Thêm mới hợp đồng");
            System.out.println("4. Hiển thị danh sách hợp đồng");
            System.out.println("5. Chỉnh sửa hợp đồng");
            System.out.println("6. Trở về menu chính");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iBookingService.add();
                    break;
                case "2":
                    iBookingService.disPlay();
                    break;
                case "3":
                    iBookingService.creatContracts();
                    break;
                case "4":
                    iBookingService.displayContracts();
                    break;
                case "5":
                    iBookingService.editContracts();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Không có lựa chọn này. Mời nhập lại");
            }
        }
    }
}
