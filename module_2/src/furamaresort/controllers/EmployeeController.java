package furamaresort.controllers;

import furamaresort.services.IEmployeeService;
import furamaresort.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    public static void employeeMenu() throws Exception {
        while (true) {
            System.out.println("1: Hiển thị danh sách nhân viên");
            System.out.println("2: Thêm mới nhân viên");
            System.out.println("3: Sửa nhân viên");
            System.out.println("4: Trở về menu chính");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iEmployeeService.disPlay();
                    break;
                case "2":
                    iEmployeeService.add();
                    break;
                case "3":
                    iEmployeeService.editEmployee();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Nhập cũng ko xong. Nhập lạiiiii");
            }
        }
    }
}
