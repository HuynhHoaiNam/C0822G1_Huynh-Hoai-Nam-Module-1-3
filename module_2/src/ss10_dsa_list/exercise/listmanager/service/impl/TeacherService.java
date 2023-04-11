package ss10_dsa_list.exercise.listmanager.service.impl;

import ss10_dsa_list.exercise.listmanager.model.Student;
import ss10_dsa_list.exercise.listmanager.model.Teacher;
import ss10_dsa_list.exercise.listmanager.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();

        teacherList.add(teacher);
        System.out.println("Thêm mới giảng viên thành công thành công");
    }

    @Override
    public void removeTeacher() {
        System.out.print("Mời bạn nhập id giảng viên cần xóa: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc chắn xoá? Nhập 1: xác nhận xoá, Nhập 2: xác nhận không xoá");
                String choice = scanner.nextLine();
                if (choice.equals("1")) {
                    teacherList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchTeacher() {
        boolean flagSearchTeacher = false;
        System.out.println("Nhập vào id giảng viên muốn tìm:");
        String id2 = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().equals(id2)) {
                System.out.println(teacherList.get(i));
                flagSearchTeacher = true;
                break;
            }
        }
        if (!flagSearchTeacher) {
            System.out.println("Không tìm thấy giảng viên này");
        }
    }

    @Override
    public void sortTeacher() {
        boolean needNextPass = true;
        for (int i = 0; i < teacherList.size() -1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < teacherList.size() -1 - i; j++) {
                if (teacherList.get(j).compareTo(teacherList.get(j + 1)) > 0) {
                    Teacher temp = teacherList.get(j + 1);
                    teacherList.set(j + 1, teacherList.get(j));
                    teacherList.set(j, temp);
                    needNextPass = true;
                }
            }
        }
    }


    public Teacher infoTeacher() {
        System.out.println("Mời nhập id giảng viên");
        String id = scanner.nextLine();
        System.out.println("Mời nhập tên giảng viên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập ngày sinh của giảng viên");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Mời nhập giới tính giảng viên");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Mời nhập chuyên môn giảng viên");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        return teacher;
    }
}
