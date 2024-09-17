package day5.lsp;

public class HinhTron implements Hinh2D{
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return 2*Math.PI*banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public void veHinh() {
        System.out.println("Định nghĩa vẽ hình tròn");
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
