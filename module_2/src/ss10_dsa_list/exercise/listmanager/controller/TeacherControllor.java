package ss10_dsa_list.exercise.listmanager.controller;

import ss10_dsa_list.exercise.listmanager.service.ITeacherService;
import ss10_dsa_list.exercise.listmanager.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherControllor {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherService iTeacherService = (ITeacherService) new TeacherService();

    public static void menuTeacher() {
        while (true) {
            System.out.println("___________________________________________________");
            System.out.println("CHƯƠNG TRONHF QUẢN LÝ HỌC VIÊN");
            System.out.println("1: Thêm mới giảng viên");
            System.out.println("2: Hiển thị danh sách giảng viên");
            System.out.println("3: Xoá giảng viên");
            System.out.println("4: Tìm kiếm giảng viên theo id");
            System.out.println("5: Sắp xếp theo tên, nếu trùng tên thì sắp xếp theo id");
            System.out.println("6: Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.displayAllTeacher();
                    break;
                case 3:
                    iTeacherService.removeTeacher();
                    break;
                case 4:
                    iTeacherService.searchTeacher();
                    break;
                case 5:
                    iTeacherService.sortTeacher();
                    break;
                case 6:
                    System.exit(0);
                    return;
            }
        }
    }

}
