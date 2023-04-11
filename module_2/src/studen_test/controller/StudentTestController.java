package studen_test.controller;

import studen_test.service.IStudentTestService;
import studen_test.service.impl.StudentTestServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class StudentTestController {
    private static IStudentTestService iStudentTestService = new StudentTestServiceImpl();

    public static void menuStudentTest() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. them moi hoc sinh");
            System.out.println("2. xoa hoc sinh");
            System.out.println("3. hien thi hoc sinh");
            System.out.println("4. tro ve menu chinh");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iStudentTestService.addStudent();
                    break;
                case "2":
                    iStudentTestService.removeStudent();
                    break;
                case "3":
                    iStudentTestService.displayStudent();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("ko co lua chon. Moi nhap lai");
            }
        }


//        Boolean flag = false;
//        while (!flag) {
//            try {
//                System.out.println("1. them moi hoc sinh");
//                System.out.println("2. xoa hoc sinh");
//                System.out.println("3. hien thi hoc sinh");
//                System.out.println("4. tro ve menu chinh");
//                int choice = Integer.parseInt(scanner.nextLine());
//                switch (choice) {
//                    case 1:
//                        iStudentTestService.addStudent();
//                        flag = true;
//                        break;
//                    case 2:
//                        iStudentTestService.removeStudent();
//                        flag = true;
//                        break;
//                    case 3:
//                        iStudentTestService.displayStudent();
//                        flag = true;
//                        break;
//                    case 4:
//                        return;
//                    default:
//                        System.out.println("ko co lua chon. Moi nhap lai");
//                }
//            } catch (NumberFormatException e) {
//                e.getMessage();
//                System.out.println("Lua chon phai la so. Moi nhap lai");
//            } catch (Exception e) {
//                e.getMessage();
//                System.out.println("Sai dinh dang moi nhap lai");
//            }
//
//        }
    }
}
