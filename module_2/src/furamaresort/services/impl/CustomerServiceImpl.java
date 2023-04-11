package furamaresort.services.impl;

import excerciseHTT.DateBirthException;
import furamaresort.Exception.Exception;
import furamaresort.models.person.Customer;
import furamaresort.models.person.Employee;
import furamaresort.services.ICustomerService;
import furamaresort.untils.ReadWriteCustomer;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Customer> customerList = new LinkedList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    ReadWriteCustomer readWriteCustomer = new ReadWriteCustomer();

    @Override
    public void editCustomer() {
        Customer customer = new Customer();
        System.out.println("Mời nhập id khách hàng cần sửa:");
        String idEdit = scanner.nextLine();
        boolean flagEdit = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(idEdit)) {
                System.out.println("Tìm thấy khách hàng. Mời nhập các thông tin mới");
                customerList.remove(i);
                customer = this.infoCustomer();
                customerList.add(i, customer);
            }
            flagEdit = true;
            break;
        }
        if (!flagEdit) {
            System.out.println("Không tìm thấy id khách hàng:");
        }
    }

    @Override
    public void add() throws IOException {
        customerList = readWriteCustomer.readCustomer();
        Customer customer = this.infoCustomer();
        customerList.add(customer);
        readWriteCustomer.writeCustomer(customerList);
        System.out.println("Thêm mới khách hàng thành công:");
    }

    @Override
    public void disPlay() throws IOException {
        customerList = readWriteCustomer.readCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public Customer infoCustomer() {
        //NHẬP ID KHÁCH HÀNG
        String id;
        System.out.println("Mời nhập id khách hàng:");
        while (true) {
            id = scanner.nextLine();
            Boolean flag = true;
            for (int i = 0; i < customerList.size() && flag; i++) {
                if (customerList.get(i).getId().equals(id)) {
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

        //NHẬP TÊN KHÁCH HÀNG
        System.out.println("Mời nhập tên khách hàng:");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                if (name.matches("^([A-Z][a-z]*[\\s])*([A-Z][a-z]*)$")) {
                    System.out.println("Nhập tên khách hàng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Tên không đúng định dạng. Mời nhập lại");
            }
        }


        //NHẬP NGÀY SINH VÀ KIỂM TRA TUỔI KHÁCH HÀNG
        System.out.println("Mời nhập ngày sinh khách hàng theo định dạng dd/MM/yyyy:");
        LocalDate dateOfBirth;
        LocalDate localDate = LocalDate.now();
        long dateResults;
        long old;
//        while (true) {
//            try {
//                dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
//                dateResults = dateOfBirth.until(localDate, ChronoUnit.DAYS);
//                old = dateResults / 365;
//                if (old >= 18 && old < 100) {
//                    System.out.println("Nhập ngày sinh thành công");
//                    break;
//                } else {
//                    throw new DateBirthException("Tuổi phải nhỏ hơn 100 và lớn hơn 18");
//                }
//            } catch (DateTimeParseException e) {
//                e.getMessage();
//                System.out.println("Nhập sai định dạng");
//            } catch (Exception e) {
//                e.getMessage();
//                System.out.println("Nhập sai định dạng. Mời nhập lại");
//            }
//        }
        while (true) {
            try {
                dateOfBirth = LocalDate.parse(scanner.nextLine(), formatter);
                dateResults = dateOfBirth.until(localDate, ChronoUnit.DAYS);
                old = dateResults / 365;
                Exception.dateException(old);
                break;
            } catch (DateBirthException e) {
                System.out.println(e.getMessage());
            }
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
            }
        }


        //NHÂP CCCD/CMND KHÁCH HÀNG
        System.out.println("Mời nhập số CCCD(12số)/CMDN(9số) khách hàng:");
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

        //NHẬP SỐ ĐIỆN THOẠI KHÁCH HÀNG
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

        //NHẬP EMAIL KHÁCH HÀNG
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

        //NHẬP KIỂU KHÁCH HÀNG
        System.out.println("Mời nhập kiểu khách hàng:");
        String customerType;
        while (true) {
            try {
                customerType = scanner.nextLine();
                if (customerType.matches("^([A-Z][a-z]*[\\s])*([A-Z][a-z]*)$")) {
                    System.out.println("Nhập kiểu khách hàng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Tên không đúng định dạng. Mời nhập lại");
            }
        }

        //NHẬP ĐỊA CHỈ KHÁCH HÀNG
        System.out.println("Mời nhập địa chỉ khách hàng:");
        String address;
        while (true) {
            try {
                address = scanner.nextLine();
                if (address.matches("^([A-Z][a-z]*[\\s])*([A-Z][a-z]*)$")) {
                    System.out.println("Nhập kiểu khách hàng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Tên không đúng định dạng. Mời nhập lại");
            }
        }
        Customer customer = new Customer(id, name, dateOfBirth, gender, idNumber, phoneNumber, email, customerType, address);
        return customer;
    }
}
