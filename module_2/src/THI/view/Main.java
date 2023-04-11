package THI.view;

import THI.controller.TaiKhoanThanhToanController;
import THI.controller.TaiKhoanTietKiemController;
import THI.until.IdException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, IdException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("----------CHƯƠNG TRÌNH QUẢN LÝ NGÂN HÀNG----------");
            System.out.print("\n Nhập 1: Quản lý tài khoản tiết kiệm \n Nhập 2: Quản lý tài khoản thanh toán\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    TaiKhoanTietKiemController.luaChonTaiKhoanTietKiem();
                    break;
                case "2":
                    TaiKhoanThanhToanController.luaChonTaiKhoanThanhToan();
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }
    }
}
