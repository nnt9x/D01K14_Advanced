package day1.bt1;

public class HinhChuNhat {
    // Thuoc tinh
    double chieuDai;
    double chieuRong;

    // Phuong thuc khoi tao - constructor
    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai <= 0 || chieuRong <= 0){
            throw new RuntimeException("Kích thước không hợp lệ!");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    // Phuong thuc chu vi
    public double chuVi(){
        return  (chieuDai + chieuRong) * 2;
    }
    // Phuong thuc tinh dien tich
    public double dienTich(){
        return chieuDai * chieuRong;
    }
}
