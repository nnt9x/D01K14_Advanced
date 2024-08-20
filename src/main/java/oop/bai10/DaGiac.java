package oop.bai10;

public class DaGiac {
    private int soCanh;
    protected float[] kichThuocCanh;

    public DaGiac(int soCanh, float[] kichThuocCanh) {
        if (soCanh != kichThuocCanh.length) {
            throw new RuntimeException("Không hợp lệ!");
        }
        this.soCanh = soCanh;
        this.kichThuocCanh = kichThuocCanh;
    }

    public float chuVi() {
        float chuVi = 0;
        for (int i = 0; i < this.soCanh; i++) {
            chuVi += kichThuocCanh[i];
        }
        return chuVi;
    }

    public void inCanh() {
        for (int i = 0; i < this.soCanh; i++) {
            System.out.printf("Canh[%d] = %.2f \n", i, this.kichThuocCanh[i]);
        }
    }
}
