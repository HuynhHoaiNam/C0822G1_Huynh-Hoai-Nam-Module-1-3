package ss10_dsa_list.exercise.listmanager.controller;

import ss10_dsa_list.exercise.listmanager.service.IStudentService;
import ss10_dsa_list.exercise.listmanager.service.impl.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService iStudentService = new StudentService();


    public static void menuStudent() throws IOException {
        while (true) {
            System.out.println("______________________________________________");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN CỦA NHÀ TRƯỜNG");
            System.out.println("1: Thêm mới học viên");
            System.out.println("2: Hiển thị danh sách học viên");
            System.out.println("3: Xoá học viên");
            System.out.println("4: Tìm kiếm học viên theo id");
            System.out.println("5: Sắp xếp theo tên, nếu trùng tên thì sắp xếp theo id");
            System.out.println("6: Thoát");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.displayAllStudent();
                    break;
                case 3:
                    iStudentService.removeStudent();
                    break;
                case 4:
                    iStudentService.searchStudent();
                    break;
                case 5:
                    iStudentService.sortStudent();
                    break;
                case 6:
                    System.exit(0);
                    return;
            }
        }

    }
}
