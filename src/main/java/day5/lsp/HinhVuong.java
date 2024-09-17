package day5.lsp;

public class HinhVuong implements Hinh2D{
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
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
    public void veHinh() {
        System.out.println("Định nghĩa vẽ hình vuông");
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
