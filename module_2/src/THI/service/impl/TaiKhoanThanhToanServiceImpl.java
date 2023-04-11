package THI.service.impl;

import THI.model.TaiKhoanThanhToan;
import THI.model.TaiKhoanTietKiem;
import THI.service.ITaiKhoanThanhToanService;
import THI.until.DocGhiTaiKhoanThanhToan;
import THI.until.DocGhiTaiKhoanTietKiem;
import THI.until.IdException;
import studen_test.model.StudentTest;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanServiceImpl implements ITaiKhoanThanhToanService {

    private static Scanner scanner = new Scanner(System.in);
    private static List<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();


    @Override
    public void themMoiTaiKhoanThanhToan() throws IOException {
        taiKhoanThanhToans = DocGhiTaiKhoanThanhToan.docTaiKhoanThanhToan();
        TaiKhoanThanhToan taiKhoanThanhToan = this.thongTinTaiKhoanThanhToan();
        taiKhoanThanhToans.add(taiKhoanThanhToan);
        DocGhiTaiKhoanThanhToan.vietTaiKhoanThanhToan(taiKhoanThanhToans);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void xoaTaiTaiKhoanThanhToa() throws IOException, IdException {
        taiKhoanThanhToans = DocGhiTaiKhoanThanhToan.docTaiKhoanThanhToan();
        System.out.print("Mời bạn nhập id học viên cần xóa: ");
        String idTaiKhoan;
        while (true) {
            idTaiKhoan = scanner.nextLine();
            boolean flagDelete = false;
            for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
                if (taiKhoanThanhToans.get(i).getIdTaiKhoan().equals(idTaiKhoan)) {
                    System.out.println("Bạn có chắc chắn xoá? Nhập 1: xác nhận xoá, Nhập 2: xác nhận không xoá");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")) {
                        taiKhoanThanhToans.remove(i);
                        DocGhiTaiKhoanThanhToan.vietTaiKhoanThanhToan(taiKhoanThanhToans);
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
    public void xemDanhSachTaiKhoanThanhToan() {
        taiKhoanThanhToans = DocGhiTaiKhoanThanhToan.docTaiKhoanThanhToan();
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToans) {
            System.out.println(taiKhoanThanhToan);
        }
    }

    @Override
    public void timKiemTaiKhoanThanhToan() throws IdException {
        boolean flagSearchStudent = false;
        System.out.println("Nhập vào id tài khoản muốn tìm:");
        String id2 = scanner.nextLine();
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (taiKhoanThanhToans.get(i).getIdTaiKhoan().equals(id2)) {
                System.out.println(taiKhoanThanhToans.get(i));
                flagSearchStudent = true;
                break;
            }
        }
        if (!flagSearchStudent) {
            throw new IdException("id không tồn tại");
        }
    }

    public TaiKhoanThanhToan thongTinTaiKhoanThanhToan() {
        System.out.println("Mời nhập id tài khoản");
        String idTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập mã tài khoản");
        String maTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập tên chủ tài khoản");
        String tenChuTaiKhoan = scanner.nextLine();
        System.out.println("Mời nhập ngày tạo tài khoản");
        String ngayTaoTaiKhoan =scanner.nextLine();
        System.out.println("Mời nhập số thẻ");
        String soThe = scanner.nextLine();
        System.out.println("Mời nhập tiền trong tào khoản");
        double soTienTrongTaiKhoan = Double.parseDouble(scanner.nextLine());
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan,
                soThe, soTienTrongTaiKhoan);
        return taiKhoanThanhToan;
    }
}
