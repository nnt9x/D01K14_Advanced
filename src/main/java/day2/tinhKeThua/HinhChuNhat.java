package day2.tinhKeThua;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new RuntimeException("Cạnh không hợp lệ!");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0) {
            throw new RuntimeException("Cạnh không hợp lệ!");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong <= 0) {
            throw new RuntimeException("Cạnh không hợp lệ!");
        }
        this.chieuRong = chieuRong;
    }

    // Tính chu vi
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    // Tính diện tích
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
