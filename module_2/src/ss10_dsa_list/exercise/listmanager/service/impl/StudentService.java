package ss10_dsa_list.exercise.listmanager.service.impl;

import excerciseHTT.CheckException;
import excerciseHTT.StudentException;
import ss10_dsa_list.exercise.listmanager.model.Student;
import ss10_dsa_list.exercise.listmanager.service.IStudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();


    public Student displayStudent() {
        StudentException.Check check = new StudentException.Check();
        Scanner scanner = new Scanner(System.in);

        String gender;
        while (true) {
            try {
                System.out.println("Nhập giới tính: ");
                gender = scanner.nextLine();
                check.checkGender(gender);
                break;
            } catch (CheckException e) {
//            e.printStackTrace();
                System.out.print(e.getMessage());
                System.out.println("\nNhập lại giới tính: ");
            }
        }


        double score;
        while (true) {
            try {
                System.out.print("\nNhập điểm: ");
                score = scanner.nextInt();
                check.checkScore(score);
                break;
            } catch (CheckException e) {
//            e.printStackTrace();
                System.out.print(e.getMessage());
                System.out.print("\nNhập lại điểm: ");
            }
        }


        String id;
        while (true) {
            try {
                boolean flag = true;
                System.out.println("Nhập id học viên: ");
                id = scanner.nextLine();
                for (int i = 0; i < studentList.size() && flag; i++) {
                    if (!studentList.get(i).getId().equals(id)) {
                        System.out.println("Nhập thành công");
                        flag = false;
                    }
                }
                if (flag) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Id đã tồn tại mời nhập lại:");
            }
        }


        String nameClass;
        String checkNameClass;
        while (true) {
            try {
                System.out.println("Nhập tên lớp của học viên: ");
                nameClass = scanner.nextLine();
                checkNameClass = "^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
                if (nameClass.matches(checkNameClass)) {
                    System.out.println("Nhập thành công");
                    break;
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Lỗi định dạng tên lớp. Mời nhập lại: ");
            }
        }


        String dateOfBirth;
        String checkDate;
        while (true) {
            try {
                System.out.println("Nhập ngày sinh học viên: ");
                dateOfBirth = scanner.nextLine();
                checkDate = "^([0-2][0-9]|3[0-9])/(0[1-9]|1[0-2])/[0-9]{4}$";
                if (dateOfBirth.matches(checkDate)) {
                    System.out.println("Nhập thành công");
                    break;
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Ngày sinh lỗi định dạng. Mời nhập lại:");
            }
        }


        String name;
        String checkName;
        while (true) {
            try {
                System.out.println("Nhập tên học viên: ");
                name = scanner.nextLine();
                checkName = "^([A-Z][a-z]*[\\s])*([A-Z][a-z]*)$";
                if (name.matches(checkName)) {
                    System.out.println("Nhập thành công");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Tên sai định dạng. Mời nhập lại tên");
            }
        }
        Student student = new Student(id, name, dateOfBirth, Boolean.parseBoolean(gender), nameClass, score);
        return student;
    }


    public List<Student> readStudent() throws IOException {
        File file = new File("src\\ss10_dsa_list\\exercise\\listmanager\\listStudent.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Student> studentList = new ArrayList<>();
        String[] info;
        Student student;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            student = new Student(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], Double.parseDouble(info[5]));
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;

    }

    public void write(List<Student> studentList) throws IOException {
        File file2 = new File("src\\ss10_dsa_list\\exercise\\listmanager\\writeStudent.csv");
        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student s : studentList) {
            bufferedWriter.write(s.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }


    @Override
    public void addStudent() throws IOException {
        studentList = this.readStudent();
        Student student = this.infoStudent();
        studentList.add(student);
        write(studentList);
        System.out.println("Thêm mới học viên thành công");
    }


    @Override
    public void removeStudent() {
        System.out.print("Mời bạn nhập id học viên cần xóa: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                System.out.println("Bạn có chắc chắn xoá? Nhập 1: xác nhận xoá, Nhập 2: xác nhận không xoá");
                String choice = scanner.nextLine();
                if (choice.equals("1")) {
                    studentList.remove(i);
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
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


    @Override
    public void searchStudent() {
        boolean flagSearchStudent = false;
        System.out.println("Nhập vào id học viên muốn tìm:");
        String id2 = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id2)) {
                System.out.println(studentList.get(i));
                flagSearchStudent = true;
                break;
            }
        }
        if (!flagSearchStudent) {
            System.out.println("Không tìm thấy học viên này");
        }
    }


    @Override
    public void sortStudent() {
        boolean needNextPass = true;
        for (int i = 0; i < studentList.size() - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).compareTo(studentList.get(j + 1)) > 0) {
                    Student temp = studentList.get(j + 1);
                    studentList.set(j + 1, studentList.get(j));
                    studentList.set(j, temp);
                    needNextPass = true;
                }
            }
        }
    }


    public Student infoStudent() {
        System.out.println("Mời nhập mã học viên");
        String id = scanner.nextLine();
        System.out.println("Mời nhập tên học viên");
        String name = scanner.nextLine();
        System.out.println("Mời nhập ngày sinh của học viên");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính học viên");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.print("Mời bạn nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học viên: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dateOfBirth, gender, nameClass, score);
        return student;
    }

}
