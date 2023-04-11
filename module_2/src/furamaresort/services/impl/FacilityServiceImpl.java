package furamaresort.services.impl;

import furamaresort.models.facility.Facility;
import furamaresort.models.facility.House;
import furamaresort.models.facility.Room;
import furamaresort.models.facility.Villa;
import furamaresort.services.IFacilityService;
import furamaresort.untils.*;

import java.io.*;
import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    ReadWriteHouse readWriteHouse = new ReadWriteHouse();
    ReadWriteVilla readWriteVilla = new ReadWriteVilla();
    ReadWriteRoom readWriteRoom = new ReadWriteRoom();
    ReadWriteFacility readWriteFacility = new ReadWriteFacility();
    ReadWriteMaintanance readWriteMaintanance = new ReadWriteMaintanance();
    private static Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> map = new LinkedHashMap<>();
    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();

    @Override
    public void add() throws IOException {
//        map = readFacility();
        while (true) {
            System.out.println("1. Thêm mới Villa\n2. Thêm mới House\n3. Thêm mới Room\n4. Trở về menu quản lý cơ sở");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    readWriteVilla.readVilla();
                    Villa villa = this.infoVilla();
                    villaList.add(villa);
                    readWriteVilla.writeVilla();
                    break;
                case 2:
//                    ReadWriteHouse.readHouse();
                    readWriteHouse.readHouse();
                    House house = this.infoHouse();
                    houseList.add(house);
                    readWriteHouse.writeHouse();
                    break;
                case 3:
                    readWriteRoom.readRoom();
                    Room room = this.infoRoom();
                    roomList.add(room);
                    readWriteRoom.writeRoom();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Có thế cũng nhâp sai. Chọn lại đê");
            }
        }

    }

    @Override
    public void disPlay() throws IOException {
        for (Villa villa : villaList) {
            map.put(villa, 0);
        }
        for (House house : houseList) {
            map.put(house, 0);
        }
        for (Room room : roomList) {
            map.put(room, 0);
        }
        map = readWriteFacility.readFacility();
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", Số lần bảo trì:" + entry.getValue());
        }
    }

    @Override
    public void displayMaintenance() throws IOException {
        map = readWriteMaintanance.readMaintenance();
        for (Map.Entry<Facility, Integer> map : map.entrySet()) {
            if (map.getValue() >= 5) {
                System.out.println(map.getKey() + ", Lần bảo trì:" + map.getValue());
            }
        }
    }

    public Villa infoVilla() {
        //NHẬP MÃ DỊCH VỤ
        System.out.println("Mời nhập mã dịch vụ theo định dạng SVVL-YYYY");
        String serviceCode;
        while (true) {
            try {
                serviceCode = scanner.nextLine();
                if (serviceCode.matches("^SVVL-[0-9]{4}$")) {
                    System.out.println("Nhập mã dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                e.getMessage();
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }

        //NHẬP TÊN DỊCH VỤ
        System.out.println("Mời nhập tên dịch vụ");
        String serviceName;
        while (true) {
            try {
                serviceName = scanner.nextLine();
                if (serviceName.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập tên dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Sai định dạng. Định dạng chưc đầu viết hoa và các chữ sau viết thường");
            }
        }


        //NHẬP DIỆN TÍCH SỬ DỤNG
        System.out.println("Mời nhập diện tích sử dụng");
        double usableArea;
        while (true) {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30) {
                    System.out.println("Nhập diện tích sử dụng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. diện tích phải là số và lớn hơn 30m2");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. NHẬP LẠIiiiiiiiiiiiii");
            }
        }


        //NHẬP DIỆN TÍCH CHO THUÊ
        System.out.println("Mời nhập diện tích cho thuê");
        double rentalCost;
        while (true) {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                if (rentalCost > 30) {
                    System.out.println("Nhập diện tích cho thuê thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. Diện tích phải là số và lớn hơn 30m2");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Diện tích phải lớn hơn 30m2");
            }
        }

        //NHẬP SỐ NGƯỜI TỐI ĐA
        System.out.println("Mời nhập số người tối đa");
        int maximumNumberOfPeople;
        while (true) {
            try {
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                    System.out.println("Nhập số người tối đa thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. Số người phải là số");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Số người phải lớn hơn 0 và nhỏ hơn 20");
            }
        }

        //NHẬP KIỂU CHO THUÊ
        System.out.println("Mời nhập kiểu cho thuê. Chữ đầu viết hoa, các chữ sau viết thường");
        String rentalType;
        while (true) {
            try {
                rentalType = scanner.nextLine();
                if (rentalType.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập kiểu cho thuê thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }

        //NHẬP TIÊU CHUẨN PHÒNG
        System.out.println("Mời nhập tiêu chuẩn phòng. Chữ đầu viết hoa, các chữ sau viết thường");
        String roomStandard;
        while (true) {
            try {
                roomStandard = scanner.nextLine();
                if (roomStandard.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập tiêu chuẩn phòng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }

        //NHẬP DIỆN TÍCH HỒ BƠI
        System.out.println("Mời nhập diện tích hồ bơi. Phải lơn hơn 30m2");
        double swimmingPoolArea;
        while (true) {
            try {
                swimmingPoolArea = Integer.parseInt(scanner.nextLine());
                if (swimmingPoolArea > 30) {
                    System.out.println("Nhập diện tích hồ bơi thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. Diện tích phải là số và lớn hơn 30m2");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Diện tích hồ bơi phải lớn hơn 30m2");
            }
        }

        //NHẬP SỐ TẦNG
        System.out.println("Mời nhập số tầng");
        int numberOfFloors;
        while (true) {
            try {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors > 0) {
                    System.out.println("Nhập số tàng thành công");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai. Số tầng phải là số nguyên dương");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai dịnh dạng.Số tầng phải là số dương");
            }
        }
        Villa villa = new Villa(serviceCode, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType, roomStandard, swimmingPoolArea, numberOfFloors);
        return villa;
    }

    public House infoHouse() {
        //NHẬP MÃ DỊCH VỤ
        System.out.println("Mời nhập mã dịch vụ theo định dạng SVHO-YYYY");
        String serviceCode;
        while (true) {
            try {
                serviceCode = scanner.nextLine();
                if (serviceCode.matches("^SVHO-[0-9]{4}$")) {
                    System.out.println("Nhập mã dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }


        //NHẬP TÊN DỊCH VỤ
        System.out.println("Mời nhập tên dịch vụ");
        String serviceName;
        while (true) {
            try {
                serviceName = scanner.nextLine();
                if (serviceName.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập tên dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Sai định dạng. Định dạng chưc đầu viết hoa và các chữ sau viết thường");
            }
        }

        //NHẬP DIỆN TÍCH SỬ DỤNG
        System.out.println("Mời nhập diện tích sử dụng");
        double usableArea;
        while (true) {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30) {
                    System.out.println("Nhập diện tích sử dụng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. diện tích phải là số và lớn hơn 30m2");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. NHẬP LẠIiiiiiiiiiiiii");
            }
        }


        //NHẬP DIỆN TÍCH CHO THUÊ
        System.out.println("Mời nhập diện tích cho thuê");
        double rentalCost;
        while (true) {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                if (rentalCost > 30) {
                    System.out.println("Nhập diện tích cho thuê thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. Diện tích phải là số và lớn hơn 30m2");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Diện tích phải lớn hơn 30m2");
            }
        }

        //NHẬP SỐ NGƯỜI TỐI ĐA
        System.out.println("Mời nhập số người tối đa");
        int maximumNumberOfPeople;
        while (true) {
            try {
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                    System.out.println("Nhập số người tối đa thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. Số người phải là số");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Số người phải lớn hơn 0 và nhỏ hơn 20");
            }
        }

        //NHẬP KIỂU CHO THUÊ
        System.out.println("Mời nhập kiểu cho thuê. Chữ đầu viết hoa, các chữ sau viết thường");
        String rentalType;
        while (true) {
            try {
                rentalType = scanner.nextLine();
                if (rentalType.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập kiểu cho thuê thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }

        //NHẬP TIÊU CHUẨN PHÒNG
        System.out.println("Mời nhập tiêu chuẩn phòng. Chữ đầu viết hoa, các chữ sau viết thường");
        String roomStandard;
        while (true) {
            try {
                roomStandard = scanner.nextLine();
                if (roomStandard.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập tiêu chuẩn phòng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }


        //NHẬP SỐ TẦNG
        System.out.println("Mời nhập số tầng");
        int numberOfFloors;
        while (true) {
            try {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors > 0) {
                    System.out.println("Nhập số tàng thành công");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai. Số tầng phải là số nguyên dương");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai dịnh dạng.Số tầng phải là số dương");
            }
        }
        House house = new House(serviceCode, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        return house;
    }

    public Room infoRoom() {
        //NHẬP MÃ DỊCH VỤ
        System.out.println("Mời nhập mã dịch vụ theo định dạng SVRO-YYYY");
        String serviceCode;
        while (true) {
            try {
                serviceCode = scanner.nextLine();
                if (serviceCode.matches("^SVRO-[0-9]{4}$")) {
                    System.out.println("Nhập mã dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                e.getMessage();
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }

        //NHẬP TÊN DỊCH VỤ
        System.out.println("Mời nhập tên dịch vụ");
        String serviceName;
        while (true) {
            try {
                serviceName = scanner.nextLine();
                if (serviceName.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập tên dịch vụ thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Sai định dạng. Định dạng chưc đầu viết hoa và các chữ sau viết thường");
            }
        }

        //NHẬP DIỆN TÍCH SỬ DỤNG
        System.out.println("Mời nhập diện tích sử dụng");
        double usableArea;
        while (true) {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30) {
                    System.out.println("Nhập diện tích sử dụng thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. diện tích phải là số và lớn hơn 30m2");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. NHẬP LẠIiiiiiiiiiiiii");
            }
        }

        //NHẬP CHI PHÍ CHO THUÊ
        System.out.println("Mời nhập chi phí cho thuê");
        double rentalCost;
        while (true) {
            try {
                rentalCost = Double.parseDouble(scanner.nextLine());
                if (rentalCost > 0) {
                    System.out.println("Nhập chi phí cho thuê thành công");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai. Số chi phí phải là số nguyên dương");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai dịnh dạng.Số chi phí thuê phải là số dương");
            }
        }

        //NHẬP SỐ NGƯỜI TỐI ĐA
        System.out.println("Mời nhập số người tối đa");
        int maximumNumberOfPeople;
        while (true) {
            try {
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                    System.out.println("Nhập số người tối đa thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Sai định dạng. Số người phải là số");
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Sai. Số người phải lớn hơn 0 và nhỏ hơn 20");
            }
        }

        //NHẬP KIỂU CHO THUÊ
        System.out.println("Mời nhập kiểu cho thuê. Chữ đầu viết hoa, các chữ sau viết thường");
        String rentalType;
        while (true) {
            try {
                rentalType = scanner.nextLine();
                if (rentalType.matches("^([A-Z][a-z]+)$")) {
                    System.out.println("Nhập kiểu cho thuê thành công");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng. Mời nhập lại");
            }
        }

        System.out.println("Mời nhập dịch vụ miễn phí đi kèm");
        String freeServiceIncludedj = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType, freeServiceIncludedj);
        return room;
    }
}
