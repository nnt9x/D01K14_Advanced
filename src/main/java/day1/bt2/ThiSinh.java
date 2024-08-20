package day1.bt2;

public class ThiSinh {
    // Thuoc tinh
    String maThiSinh;
    String hoTen;
    String ngaySinh;
    String gioiTinh;
    double diemToan;
    double diemVan;
    double diemTiengAnh;

    // Phuong thuc khoi tao
    public ThiSinh(String maThiSinh, String hoTen) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
    }

    public ThiSinh(String maThiSinh, String hoTen, String ngaySinh, String gioiTinh, double diemToan, double diemVan, double diemTiengAnh) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemTiengAnh = diemTiengAnh;
    }

}
