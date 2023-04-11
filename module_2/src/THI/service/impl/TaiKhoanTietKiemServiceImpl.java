package THI.service.impl;

import THI.model.TaiKhoanTietKiem;
import THI.service.ITaiKhoanTietKiemService;
import THI.until.DocGhiTaiKhoanTietKiem;
import THI.until.IdException;
import studen_test.model.StudentTest;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemServiceImpl implements ITaiKhoanTietKiemService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<TaiKhoanTietKiem> taiKhoanTietKiems = new ArrayList<>();

    @Override
    public void themTaiKhoanTietKiem() throws IOException, IdException {
        taiKhoanTietKiems = DocGhiTaiKhoanTietKiem.docTaiKhoanTietKiem();
        TaiKhoanTietKiem taiKhoanTietKiem = this.thongTinTaiKhoanTietKiem();
        taiKhoanTietKiems.add(taiKhoanTietKiem);
        DocGhiTaiKhoanTietKiem.vietTaiKhoanTietKiem(taiKhoanTietKiems);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void xoaTaiKhoanTietKiem() throws IOException, IdException {
        taiKhoanTietKiems = DocGhiTaiKhoanTietKiem.docTaiKhoanTietKiem();
        System.out.print("Mời bạn nhập id học viên cần xóa: ");
        String idTaiKhoan;
        while (true) {
            idTaiKhoan = scanner.nextLine();
            boolean flagDelete = false;
            for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
                if (taiKhoanTietKiems.get(i).getIdTaiKhoan().equals(idTaiKhoan)) {
                    System.out.println("Bạn có chắc chắn xoá? Nhập 1: xác nhận xoá, Nhập 2: xác nhận không xoá");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")) {
                        taiKhoanTietKiems.remove(i);
                        DocGhiTaiKhoanTietKiem.vietTaiKhoanTietKiem(taiKhoanTietKiems);
                        System.out.println("Xóa thành công");
                        flagDelete = true;
                        break;
                    } else if (choice.equals("2")) {
                        return;
                    }
                }
            }
            if (!flagDelete) {
                throw new IdException("id không tồn tại");
            } else {
                break;
            }
        }
    }

    @Override
    public void xemDanhSachTaiKhoanTietKiem() {
        taiKhoanTietKiems = DocGhiTaiKhoanTietKiem.docTaiKhoanTietKiem();
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiems) {
            System.out.println(taiKhoanTietKiem);
        }
    }

    @Override
    public void timKiemTaiKhoanTietKiem() throws IdException {
        boolean flagSearchStudent = false;
        System.out.println("Nhập vào id tài khoản muốn tìm:");
        String id2 = scanner.nextLine();
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (taiKhoanTietKiems.get(i).getIdTaiKhoan().equals(id2)) {
                System.out.println(taiKhoanTietKiems.get(i));
                flagSearchStudent = true;
                break;
            }
        }
        if (!flagSearchStudent) {
            throw new IdException("id không tồn tại");
        }
    }

    public TaiKhoanTietKiem thongTinTaiKhoanTietKiem() {
        System.out.println("Mời nhập id tài khoản");
        String idTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập mã tài khoản");
        String maTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập tên chủ tài khoản");
        String tenChuTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập ngày tạo tài khoản");
        String ngayTaoTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập số tiền gửi tiết kiệm");
        double soTienGuiTietKiem = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập ngày gửi tiết kiệm");
        String ngayyGuiTietKiem = scanner.nextLine();
        System.out.println("Mời nhập lãi suất");
        double laiSuat = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập kì hạn");
        String kiHan = scanner.nextLine();

        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan,
                soTienGuiTietKiem, ngayyGuiTietKiem, laiSuat, kiHan);
        return taiKhoanTietKiem;
    }
}
