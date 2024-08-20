package day1.tinhDongGoi;

public class TaiKhoan {
    private String maTaiKhoan;
    private String tenTaiKhoan;
    private String soTaiKhoan;
    private int soTien;
    public String diaChi;

    public TaiKhoan(String maTaiKhoan, String tenTaiKhoan, String soTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTaiKhoan = soTaiKhoan;
        this.soTien = 0;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public int getSoTien() {
        return soTien;
    }

    public int napTien(int soTien) {
        if (soTien <= 0) {
            throw new RuntimeException("Số tiền không hợp lệ");
        } else {
            this.soTien = this.soTien + soTien;
        }
        return this.soTien;
    }

    public int thanhToan(int soTien) {
        if (soTien <= 0) {
            throw new RuntimeException("Số tiền không hợp lệ");
        }
        if (this.soTien < soTien) {
            throw new RuntimeException("Vượt quá số dư");
        } else {
            this.soTien = this.soTien - soTien;
        }
        return this.soTien;
    }
}
