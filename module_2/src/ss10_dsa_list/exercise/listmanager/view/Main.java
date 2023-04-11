package ss10_dsa_list.exercise.listmanager.view;

import ss10_dsa_list.exercise.listmanager.controller.StudentController;
import ss10_dsa_list.exercise.listmanager.controller.TeacherControllor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("----------CHƯƠNG TRÌNH QUẢN LÝ QUẢ NHÀ TRƯỜNG----------");
            System.out.print("\n Nhập 1: Quản lý học viên \n Nhập 2: Quản lý giảng viên\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherControllor.menuTeacher();
                    break;
//                default:
//                    System.out.println("Vui lòng chọn lại");
//                    choice = scanner.nextInt();
//                    break;
            }
        }

    }
}
