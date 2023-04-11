package studen_test.service.impl;

import studen_test.model.StudentTest;
import studen_test.service.IStudentTestService;
import studen_test.until.ReadWriteStudentTest;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTestServiceImpl implements IStudentTestService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<StudentTest> studentTestList = new ArrayList<>();
    ReadWriteStudentTest readWriteStudentTest = new ReadWriteStudentTest();

    @Override
    public void addStudent() throws IOException {
        studentTestList = readWriteStudentTest.readStudentTest();
        StudentTest studentTest = this.inforStudenTest();
        studentTestList.add(studentTest);
        readWriteStudentTest.writeStudentTest(studentTestList);
        System.out.println("them moi thanh cong");
    }

    @Override
    public void removeStudent() throws IOException {
        //OKKKKK// Check và Xoá học viên bằng id
        studentTestList = readWriteStudentTest.readStudentTest();
        System.out.print("Mời bạn nhập id học viên cần xóa: ");
        String id;
        while (true) {
            id = scanner.nextLine();
            boolean flagDelete = false;
            for (int i = 0; i < studentTestList.size(); i++) {
                if (studentTestList.get(i).getId().equals(id)) {
                    System.out.println("Bạn có chắc chắn xoá? Nhập 1: xác nhận xoá, Nhập 2: xác nhận không xoá");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")) {
                        studentTestList.remove(i);
                        readWriteStudentTest.writeStudentTest(studentTestList);
                        System.out.println("Xóa thành công");
                        flagDelete = true;
                        break;
                    } else if (choice.equals("2")) {
                        return;
                    }
                }
            }
            if (!flagDelete) {
                System.out.println("Không tìm thấy đối tượng cần xóa.Mời nhập lại");
            } else {
                break;
            }
        }
    }

    @Override
    public void displayStudent() throws IOException {
        studentTestList = readWriteStudentTest.readStudentTest();
        for (StudentTest studentTest : studentTestList) {
            System.out.println(studentTest);
        }
    }

    public StudentTest inforStudenTest() {
        System.out.println("Moi nhap id");
        String id = scanner.nextLine();
        System.out.println("Moi nhap ten");
        String name = scanner.nextLine();

        //NGAY SINH
        String checkDateOfBirth;
        do {
            System.out.println("Mời nhập ngày sinh");
            checkDateOfBirth = scanner.nextLine();
            if (!isDateValid(checkDateOfBirth)) {
                System.out.println("Ngày sinh không đúng định dạng. Mời nhập lại");
            }
        } while (!isDateValid(checkDateOfBirth));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth = LocalDate.parse(checkDateOfBirth, formatter);
        LocalDate nowSub18 = LocalDate.now().minusYears(18);

        if (dateOfBirth.compareTo(nowSub18) < 0) {
            System.out.println("Nhập thành công");
        } else {
            System.out.println("Bạn chưa đủ tuổi");
        }


        System.out.println("Moi nhap gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("Moi nhap ten lop");
        String nameClass = scanner.nextLine();
        System.out.println("Moi nhap diem");
        double score = Double.parseDouble(scanner.nextLine());


        StudentTest studentTest = new StudentTest(id, name, dateOfBirth, gender, nameClass, score);
        return studentTest;
    }

    public boolean isDateValid(String targe) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(targe);
            return true;
        } catch (ParseException e) {
        }
        return false;
    }
}
