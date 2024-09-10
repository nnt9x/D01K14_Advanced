package day3;

public abstract class HinhHoc {
    // Tên hình
    private String tenHinh;
    private String mauSac;

    public HinhHoc(String tenHinh, String mauSac) {
        this.tenHinh = tenHinh;
        this.mauSac = mauSac;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    // Phuong thuc truu tuong
    public abstract double chuVi();
    public abstract double dienTich();

}
