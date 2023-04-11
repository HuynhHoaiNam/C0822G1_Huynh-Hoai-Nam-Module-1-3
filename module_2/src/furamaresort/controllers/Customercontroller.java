package furamaresort.controllers;

import furamaresort.services.ICustomerService;
import furamaresort.services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class Customercontroller {
    private static ICustomerService iCustomerService = new CustomerServiceImpl();

    public static void customerMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1: Hiển thị danh sách khách hàng");
            System.out.println("2: Thêm mới khách hàng");
            System.out.println("3: Chỉnh sửa thông tin khách hàng");
            System.out.println("4: Trở về menu chính");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iCustomerService.disPlay();
                    break;
                case "2":
                    iCustomerService.add();
                    break;
                case "3":
                    iCustomerService.editCustomer();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Không có lựa chọn này. Mời nhập lại");
            }
        }
    }
}
