package day5.lsp;

public class Main {
    private static Hinh2D hh;
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong(5);
        HinhTron ht = new HinhTron(10);

        hh = hv;
        // Chuong trinh chinh - ve hinh bat ki
        hh.veHinh();
    }
}
