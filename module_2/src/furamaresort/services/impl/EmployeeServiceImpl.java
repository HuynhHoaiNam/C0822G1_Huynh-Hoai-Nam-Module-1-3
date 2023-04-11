package furamaresort.services.impl;

import furamaresort.models.person.Employee;
import furamaresort.services.IEmployeeService;
import ss10_dsa_list.exercise.listmanager.model.Student;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeeServiceImpl implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void editEmployee() throws Exception {
        Employee employee = new Employee();
        System.out.println("Mời nhập id nhân viên cần sửa:");
        String idEdit = scanner.nextLine();
        boolean flagEdit = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(idEdit)) {
                System.out.println("Tìm thấy nhân viên. Mời nhập các thông tin mới");
                employeeList.remove(i);
                employee = this.infoEmployee();
                employeeList.add(i, employee);
            }
            flagEdit = true;
            break;
        }
        if (!flagEdit) {
            System.out.println("Không tìm thấy id nhân viên:");
        }

    }

    @Override
    public void add() throws Exception {
        employeeList = readEmployee();
        Employee employee = this.infoEmployee();
        employeeList.add(employee);
        writeEmployee(employeeList);
        System.out.println("Thêm mới nhân viên thành công:");
    }

    @Override
    public void disPlay() throws IOException {
        employeeList = readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public Employee infoEmployee() throws Exception {

        //NHẬP ID
        String id;
        System.out.println("Mời nhập id nhân viên:");
        while (true) {
            id = scanner.nextLine();
            Boolean flag = true;
            for (int i = 0; i < employeeList.size() && flag; i++) {
                if (employeeList.get(i).getId().equals(id)) {
                    System.out.println("Id bị trùng. Mời nhập lại");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Nhập id thành công");
                break;
            }
        }

        //NHẬP TÊN NHÂN VIÊN
        System.out.println("Mời nhập tên nhân viên:");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (name.matches("^([A-Z][a-z]*[\\s])*([A-Z][a-z]*)$")) {
                    System.out.println("Nhập tên nhân viên thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Tên không đúng định dạng. Mời nhập lại");
            }
        }


        //NHẬP NGÀY SINH VÀ KIỂM TRA TUỔI
//        System.out.println("Mời nhập ngày sinh nhân viên theo định dạng dd/MM/yyyy:");
//        LocalDate dateOfBirth;
//        LocalDate localDate = LocalDate.now();
//        long dateResults;
//        long old;
//        while (true) {
//            try {
//                dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
//                dateResults = dateOfBirth.until(localDate, ChronoUnit.DAYS);
//                old = dateResults / 365;
//                if (old >= 18 && old < 100) {
//                    System.out.println("Nhập tuổi thành công");
//                    break;
//                } else {
//                    throw new Exception();
//                }
//            } catch (DateTimeParseException e) {
//                e.getMessage();
//                System.out.println("Nhập sai định dạng");
//            } catch (Exception e) {
//                e.getMessage();
//                System.out.println("Nhập sai định dạng. Mời nhập lại");
//            }
//        }

//        System.out.println("Mời nhập ngày sinh nhân viên theo định dạng dd/MM/yyyy:");
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

        if (dateOfBirth.compareTo(nowSub18) > 0 && dateOfBirth.compareTo(nowSub18) < 100) {
            System.out.println("Nhập thành công");
        } else {
            System.out.println("Bạn chưa đủ tuổi");
        }


        //NHẬP GIỚI TÍNH
        System.out.println("Mời chọn giới tính:");
        String gender = "";
        boolean flagGender = false;
        while (!flagGender) {
            try {
                System.out.println("1. Nam\t2. Nữ\t3. LGBT");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        gender = "Nam";
                        flagGender = true;
                        break;
                    case 2:
                        gender = "Nữ";
                        flagGender = true;
                        break;
                    case 3:
                        gender = "LGBT";
                        flagGender = true;
                        break;
                    default:
                        System.out.println("Không có lựa chọn. MỜi nhập lại");
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Lựa chọn là các số. Mời nhập lại");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Không có lựa chọn này");
            }
        }


        //NHẬP CĂN CƯỚC CÔNG DÂN
        System.out.println("Mời nhập số CCCD(12số)/CMDN(9số) nhân viên:");
        String idNumber;
        while (true) {
            try {
                idNumber = scanner.nextLine();
                if (idNumber.matches("^[0-9]{9}$") || idNumber.matches("^[0-9]{12}")) {
                    System.out.println("Nhập CCCD/CMDN thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Số CCCD/CMND sai định dạng. Mời nhập lại");
            }
        }


        //NHẬP SỐ ĐIỆN THOẠI
        System.out.println("Mời nhập số điện thoại nhân viên:");
        String phoneNumber;
        while (true) {
            try {
                phoneNumber = scanner.nextLine();
                if (phoneNumber.matches("^0[1-9][0-9]{8}$")) {
                    System.out.println("Nhập số điện thoại thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Số điện thoiaj sai định dạng. Mời nhập lại");
            }
        }


        //NHẬP EMAIL
        System.out.println("Mời nhập email nhân viên:");
        String email;
        while (true) {
            try {
                email = scanner.nextLine();
                if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    System.out.println("Nhập email thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Email sai định dạng. Mời nhập lại");
            }
        }


        //NHẬP TRÌNH ĐỘ
        System.out.println("Mời chọn cấp độ nhân viên:");
        String level = "";
        boolean flagLevel = false;
        while (!flagLevel) {
            try {
                System.out.println("1. Trung Cấp\t2. Cao Đẳng");
                System.out.println("3. Đại Học\t4. Sau Đại Học");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        level = "Trung Cấp";
                        flagLevel = true;
                        break;
                    case 2:
                        level = "Cao Đẳng";
                        flagLevel = true;
                        break;
                    case 3:
                        level = "Đại Học";
                        flagLevel = true;
                        break;
                    case 4:
                        level = "Sau Đại Học";
                        flagLevel = true;
                        break;
                    default:
                        System.out.println("Không có lựa chọn. MỜi nhập lại");
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Lựa chọn là các số. Mời nhập lại");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Không có lựa chọn này");
            }
        }


        // NHẬP VỊ TRÍ
        System.out.println("Mời chọn vị nhân viên phù hợp:");
        String location = "";
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("1. Lễ tân\t2. Phục vụ");
                System.out.println("3. Chuyên viên\t4. Giám sát");
                System.out.println("5. Quản lý\t6. Giám đốc");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        location = "Lễ tân";
                        flag = true;
                        break;
                    case 2:
                        location = "Phục vụ";
                        flag = true;
                        break;
                    case 3:
                        location = "Chuyên viên";
                        flag = true;
                        break;
                    case 4:
                        location = "Giám sát";
                        flag = true;
                        break;
                    case 5:
                        location = "Quản lý";
                        flag = true;
                        break;
                    case 6:
                        location = "Giám đốc";
                        flag = true;
                        break;
                    default:
                        System.out.println("Không có lựa chọn. MỜi nhập lại");
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Lựa chọn là các số. Mời nhập lại");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Không có lựa chọn này");
            }
        }

        //NHẬP LƯƠNG NHÂN VIÊN
        System.out.println("Mời nhập lương nhân viên:");
        String wage;
        while (true) {
            try {
                wage = scanner.nextLine();
                if (wage.matches("^[0-9]+$")) {
                    System.out.println("Nhập Lương nhân viên thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Lương phải là số và lớn hơn 0");
            }
        }

        Employee employee = new Employee(id, name, dateOfBirth, gender, idNumber, phoneNumber, email, level, location, wage);
        return employee;
    }


    //KIểm tra định dạng ngày sinh
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

    public List<Employee> readEmployee() throws IOException {
        File file = new File("src\\furamaresort\\data\\employee.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        Employee employee;
        while (((line = bufferedReader.readLine()) != null)) {
            info = line.split(",");
            employee = new Employee(info[0], info[1], LocalDate.parse(info[2]), info[3], info[4], info[5], info[6], info[7], info[8], info[9]);
            employeeList.add(employee);
        }
        bufferedReader.close();
        return employeeList;
    }

    public void writeEmployee(List<Employee> employees) throws IOException {
        File file2 = new File("src\\furamaresort\\data\\employee.csv");
        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee s : employeeList) {
            bufferedWriter.write(s.getInfoEmployee());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
