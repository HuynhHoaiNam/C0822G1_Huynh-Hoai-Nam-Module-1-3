package THI.model;

import java.time.LocalDate;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private double soTienGuiTietKiem;
    private String ngayyGuiTietKiem;
    private double laiSuat;
    private String kiHan;


    @Override
    public String thongTin() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getIdTaiKhoan(), getMaTaiKhoan(), getTenChuTaiKhoan(),
                getNgayTaoTaiKhoan(), getSoTienGuiTietKiem(), getNgayyGuiTietKiem(), getLaiSuat(), getKiHan());
    }

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(String idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            double soTienGuiTietKiem, String ngayyGuiTietKiem, double laiSuat, String kiHan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayyGuiTietKiem = ngayyGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public double getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(double soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayyGuiTietKiem() {
        return ngayyGuiTietKiem;
    }

    public void setNgayyGuiTietKiem(String ngayyGuiTietKiem) {
        this.ngayyGuiTietKiem = ngayyGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem:" + super.toString() +
                "soTienGuiTietKiem:" + soTienGuiTietKiem +
                ", ngayyGuiTietKiem:" + ngayyGuiTietKiem +
                ", laiSuat:" + laiSuat +
                ", kiHan:" + kiHan;

    }


}
