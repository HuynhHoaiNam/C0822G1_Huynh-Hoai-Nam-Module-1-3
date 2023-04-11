package furamaresort.services.impl;

import furamaresort.models.Booking;
import furamaresort.models.Contract;
import furamaresort.models.person.Customer;
import furamaresort.services.IBookingService;
import furamaresort.untils.ReadWriteBooking;
import furamaresort.untils.ReadWriteContracts;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    ReadWriteContracts readWriteContracts = new ReadWriteContracts();
    private static LinkedList<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static TreeSet<Booking> bookingTreeSet = new TreeSet<>();
    private static TreeSet<Contract> contractTreeSet = new TreeSet<>();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    ReadWriteBooking readWriteBooking = new ReadWriteBooking();

    @Override
    public void creatContracts() throws IOException {
        readWriteContracts.readContracts();
        Contract contract = this.infoContracts();
        contractTreeSet.add(contract);
        readWriteContracts.writeContracts();
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void displayContracts() throws IOException {
        readWriteContracts.readContracts();
        for (Contract contract : contractTreeSet) {
            System.out.println(contract);
        }
    }

    @Override
    public void editContracts() {

    }

    @Override
    public void add() throws IOException {
        Booking booking = this.infoBooking();
        bookingTreeSet.add(booking);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void disPlay() throws IOException {
        readWriteBooking.readBooking();
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking);
        }
    }

    public Booking infoBooking() throws IOException {
        //NHẬP MÃ BOOKING
        System.out.println("Mời nhập mã dịch vụ. VL/HO/RO");
        String bookingId;
        while (true) {
            try {
                bookingId = scanner.nextLine();
                if (bookingId.matches("^(VL|HO|RO)$")) {
                    System.out.println("Nhập mã dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                e.getMessage();
                System.out.println("Không có mã này. Mời nhập lại");
            }
        }


        //NHẬP NGÀY BẮT ĐẦU
        System.out.println("Mời nhập ngày bắt đầu theo định dạng dd/MM/yyyy:");
        LocalDate startDay;
        LocalDate localDate = LocalDate.now();
        long dateResults;
        while (true) {
            try {
                startDay = LocalDate.parse(scanner.nextLine(), formatter);
                dateResults = localDate.until(startDay, ChronoUnit.DAYS);
                if (dateResults > 0) {
                    System.out.println("Nhập ngày bắt đầu thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (DateTimeParseException e) {
                e.getMessage();
                System.out.println("Nhập sai định dạng");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Ngày bắt đầu phải lớn hơn ngày hiện tại. Nhập lại");
            }
        }


        //NHẬP NGÀY KẾT THÚC
        System.out.println("Mời nhập ngày kết thúc theo định dạng dd/MM/yyyy:");
        LocalDate endDate;
        long dateResults2;
        while (true) {
            try {
                endDate = LocalDate.parse(scanner.nextLine(), formatter);
                dateResults2 = startDay.until(endDate, ChronoUnit.DAYS);
                if (dateResults2 > 0) {
                    System.out.println("Nhập ngày kết thúc thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (DateTimeParseException e) {
                e.getMessage();
                System.out.println("Nhập sai định dạng");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Ngày kết thúc phải lớn hơn ngày bắt đầu");
            }
        }


        //CHỌN MÃ KHÁCH HÀNG
        customerService.disPlay();
        System.out.println("Mời nhập mã khách hàng trong danh sách trên");
        String customerId;

        while (true) {

                customerId = scanner.nextLine();
                Boolean flag = false;
                for (int i = 0; i < customerList.size()&&flag; i++) {
                    if (customerList.get(i).getId().equals(customerId)) {
                        System.out.println("Nhập id thành công");
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("nhập lại");
                } else {
                    break;
                }
        }

//        String bookingId;
//        while (true) {
//            try {
//                bookingId = scanner.nextLine();
//                if (bookingId.matches("^(VL|HO|RO)$")) {
//                    System.out.println("Nhập mã dịch vụ thành công");
//                    break;
//                } else {
//                    throw new Exception();
//                }
//
//            } catch (Exception e) {
//                e.getMessage();
//                System.out.println("Không có mã này. Mời nhập lại");
//            }
//        }


        System.out.println("Mời nhập mã dịch vụ");
        String serviceId = scanner.nextLine();

        //NHẬP LOẠI DỊCH VỤ
        System.out.println("Mời nhập loại dịch vụ VL, HO, RO");
        String serviceType;
        while (true) {
            try {
                serviceType = scanner.nextLine();
                if (serviceType.equals("VL") || serviceType.equals("HO") || serviceType.equals("RO")) {
                    System.out.println("Nhập loại dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Loại dịch vụ sai. Nhập lại");
            }

        }

        Booking booking = new Booking(bookingId, startDay, endDate, customerId, serviceId, serviceType);
        return booking;
    }

    public Contract infoContracts() {
        System.out.println("Mời nhập số lượng hợp đồng");
        String numberOfContracts = scanner.nextLine();
        System.out.println("Mời nhập mã hợp đồng");
        String bookingId = scanner.nextLine();
        System.out.println("Mời nhập tiền đặt cọc");
        int deposit = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập tổng số tiền");
        int payments = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập mã khách hàng");
        String customerId = scanner.nextLine();

        Contract contract = new Contract(numberOfContracts, bookingId, deposit, payments, customerId);
        return contract;
    }
}
