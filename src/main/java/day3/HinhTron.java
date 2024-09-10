package day3;

public class HinhTron extends HinhHoc {
    public double banKinh = 1.0;

    public HinhTron(String mauSac, double banKinh) {
        super("Hình tròn", mauSac);
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return banKinh * 2 * Math.PI;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ",chuVi="+chuVi()+
                ",dienTich="+dienTich()+
                '}';
    }
}
