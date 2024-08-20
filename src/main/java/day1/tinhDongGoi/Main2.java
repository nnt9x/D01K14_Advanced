package day1.tinhDongGoi;

public class Main2 {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan("TK1", "Khách hàng 1","1234");
        // Số dư
        System.out.println(tk1.getSoTien() + " VND");
        // Nap 1tr
        tk1.napTien(1000000);
        System.out.println(tk1.getSoTien() + " VND");
        // Thanh toan 600000
        tk1.thanhToan(600000);
        System.out.println(tk1.getSoTien() + " VND");

    }
}
