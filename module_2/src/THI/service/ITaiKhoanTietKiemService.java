package THI.service;

import THI.until.IdException;

import java.io.IOException;

public interface ITaiKhoanTietKiemService {
    void themTaiKhoanTietKiem() throws IOException, IdException;
    void xoaTaiKhoanTietKiem() throws IOException, IdException;
    void xemDanhSachTaiKhoanTietKiem();
    void timKiemTaiKhoanTietKiem() throws IdException;
}
