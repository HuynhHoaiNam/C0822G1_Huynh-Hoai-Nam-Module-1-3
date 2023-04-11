package THI.model;


public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private String soThe;
    private double soTienTrongTaiKhoan;


    @Override
    public String thongTin() {
        return String.format("%s,%s,%s,%s,%s,%s", getIdTaiKhoan(), getMaTaiKhoan(), getTenChuTaiKhoan(),
                getNgayTaoTaiKhoan(), getSoThe(), getSoTienTrongTaiKhoan());
    }

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan,
                             String ngayTaoTaiKhoan, String soThe, double soTienTrongTaiKhoan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan:" + super.toString() +
                "soThe:" + soThe +
                ", soTienTrongTaiKhoan:" + soTienTrongTaiKhoan +
                '}';
    }

}
