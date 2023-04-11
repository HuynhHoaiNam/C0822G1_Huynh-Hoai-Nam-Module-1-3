package THI.controller;

import THI.service.ITaiKhoanThanhToanService;
import THI.service.impl.TaiKhoanThanhToanServiceImpl;
import THI.until.IdException;

import java.io.IOException;
import java.util.Scanner;

public class TaiKhoanThanhToanController {
    private static ITaiKhoanThanhToanService iTaiKhoanThanhToanService = new TaiKhoanThanhToanServiceImpl();

    public static void luaChonTaiKhoanThanhToan() throws IOException, IdException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm mới tài khoản thanh toán");
            System.out.println("2. Xoá tài khoản thanh toán");
            System.out.println("3. Hiển thị tài khoản thanh toán");
            System.out.println("4. Trở về menu chính");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    iTaiKhoanThanhToanService.themMoiTaiKhoanThanhToan();
                    break;
                case "2":
                    iTaiKhoanThanhToanService.xoaTaiTaiKhoanThanhToa();
                    break;
                case "3":
                    iTaiKhoanThanhToanService.xemDanhSachTaiKhoanThanhToan();
                    break;
                case "4":
                    iTaiKhoanThanhToanService.timKiemTaiKhoanThanhToan();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Không có lựa chọn. Mời nhập lại");
            }
        }
    }
}
