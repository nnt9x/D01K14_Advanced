package day3;

public class HinhVuong extends HinhHoc {
    public double canh = 1.0;

    public HinhVuong(double canh) {
        super("Hinh Vuông", "Đen");
        this.canh = canh;
    }

    public HinhVuong(String mauSac, double canh) {
        super("Hình Vuông", mauSac);
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return canh * 4;
    }

    @Override
    public double dienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                ",chuVi="+chuVi()+
                ",dienTich="+dienTich()+
                '}';
    }
}
