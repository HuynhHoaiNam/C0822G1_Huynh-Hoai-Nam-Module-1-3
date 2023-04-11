package THI.controller;

import THI.service.ITaiKhoanTietKiemService;
import THI.service.impl.TaiKhoanTietKiemServiceImpl;
import THI.until.IdException;
import studen_test.service.IStudentTestService;
import studen_test.service.impl.StudentTestServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class TaiKhoanTietKiemController {
    private static ITaiKhoanTietKiemService iTaiKhoanTietKiemService = new TaiKhoanTietKiemServiceImpl();

    public static void luaChonTaiKhoanTietKiem() throws IOException, IdException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm mới tài khoản tiết kiệm");
            System.out.println("2. Xoá tài khoản tiết kiệm");
            System.out.println("3. Hiển thị tài khoản tiết kiệm");
            System.out.println("4. Trở về menu chính");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iTaiKhoanTietKiemService.themTaiKhoanTietKiem();
                    break;
                case "2":
                    iTaiKhoanTietKiemService.xoaTaiKhoanTietKiem();
                    break;
                case "3":
                    iTaiKhoanTietKiemService.xemDanhSachTaiKhoanTietKiem();
                    break;
                case "4":
                    iTaiKhoanTietKiemService.timKiemTaiKhoanTietKiem();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Không có lựa chọn. Mời nhập lại");
            }
        }
    }
}
