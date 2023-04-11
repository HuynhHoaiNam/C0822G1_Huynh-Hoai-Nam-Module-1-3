import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class main {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int count;
//        String temp;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Nhập vào số chuỗi mà bạn muốn sắp xếp theo Alphabet  :");
//        count = scan.nextInt();
//        String str[] = new String[count];
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Nhập giá trị cho từng chuỗi:");
//        for (int i = 0; i < count; i++) {
//            str[i] = scan2.nextLine();
//        }
//        scan.close();
//        scan2.close();
//        for (int i = 0; i < count; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (str[i].compareTo(str[j]) > 0) {
//                    temp = str[i];
//                    str[i] = str[j];
//                    str[j] = temp;
//                }
//            }
//        }
//        System.out.print("Các chuỗi sau khi sắp xếp là:");
//        for (int i = 0; i <= count - 1; i++) {
//            System.out.print(str[i] + ", ");
//        }

        //NHẬP NGÀY BẮT ĐẦU
//        System.out.println("Mời nhập ngày bắt đầu theo định dạng dd/MM/yyyy:");
//        LocalDate startDay;
//        LocalDate localDate = LocalDate.now();
//        long dateResults;
//        while (true) {
//            try {
//                startDay = LocalDate.parse(scanner.nextLine(), formatter);
//                dateResults = localDate.until(startDay, ChronoUnit.DAYS);
//                if (dateResults > 0) {
//                    System.out.println("Nhập ngày bắt đầu thành công");
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
    }
}

