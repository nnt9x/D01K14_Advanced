package day2.tinhKeThua;

public class Main {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong(5);
        System.out.println(hv.toString());
        System.out.println("Chu vi: "+ hv.chuVi());
        System.out.println("Diên tích: "+hv.dienTich());
    }
}
