package studen_test.view;

import ss10_dsa_list.exercise.listmanager.controller.TeacherControllor;
import studen_test.controller.StudentTestController;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Quản lý học viên");
            System.out.println("2.Quản lý giảng viên");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    StudentTestController.menuStudentTest();
                    break;
                case "2":
                    TeacherControllor.menuTeacher();
                    break;
                default:
                    System.out.println("ko co lua chon nay");
            }

        }

    }
}
