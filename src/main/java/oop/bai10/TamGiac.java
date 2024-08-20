package oop.bai10;

public class TamGiac extends DaGiac {

    public TamGiac(float[] kichThuocCanh) {
        super(3, kichThuocCanh);
        // Kiem tra kich thuoc mang nhap vao co bang 3
        if (kichThuocCanh.length != 3) {
            throw new RuntimeException("Không phải tam giác!");
        }
        // Kiem tra xem co phai tam giac hay ko ?
        float a = kichThuocCanh[0];
        float b = kichThuocCanh[1];
        float c = kichThuocCanh[2];
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new RuntimeException("Không phải tam giác!");
        }
    }

    @Override
    public float chuVi() {
        return super.chuVi();
    }

    public float dienTich() {
        float p = chuVi() / 2;
        float a = this.kichThuocCanh[0];
        float b = this.kichThuocCanh[1];
        float c = this.kichThuocCanh[2];
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
