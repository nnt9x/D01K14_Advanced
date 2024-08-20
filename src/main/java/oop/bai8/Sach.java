package oop.bai8;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        if (soTrang <= 0) {
            throw new RuntimeException("Số trang phải lớn hơn 0");
        }
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        if (soTrang <= 0) {
            throw new RuntimeException("Số trang phải lớn hơn 0");
        }
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" + super.toString() +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
