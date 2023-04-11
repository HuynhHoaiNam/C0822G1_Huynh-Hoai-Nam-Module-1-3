package furamaresort.controllers;

import furamaresort.services.IFacilityService;
import furamaresort.services.impl.FacilityServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService iFacilityService = new FacilityServiceImpl();

    public static void facilityMenu() throws Exception {
        while (true) {
            System.out.println("1: Hiển thị danh sách cơ sở vật chất");
            System.out.println("2: Thêm mới cơ sở vật chất");
            System.out.println("3: Hiển thị danh sách bảo trì cơ sở vật chất");
            System.out.println("4: Trở về menu chính");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iFacilityService.disPlay();
                    break;
                case "2":
                    iFacilityService.add();
                    break;
                case "3":
                    iFacilityService.displayMaintenance();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Không có lựa chọn này. Mời nhập lại");
            }
        }
    }
}
