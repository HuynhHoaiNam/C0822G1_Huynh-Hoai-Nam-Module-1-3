package THI.service;

import THI.until.IdException;

import java.io.IOException;

public interface ITaiKhoanThanhToanService {
    void themMoiTaiKhoanThanhToan() throws IOException;
    void xoaTaiTaiKhoanThanhToa() throws IOException, IdException;
    void xemDanhSachTaiKhoanThanhToan();
    void timKiemTaiKhoanThanhToan() throws IdException;
}
