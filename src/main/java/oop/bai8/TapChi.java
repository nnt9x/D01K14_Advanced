package oop.bai8;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        if (soPhatHanh <= 0) {
            throw new RuntimeException("Số phát hành phải dương");
        }
        if (thangPhatHanh < 1 || thangPhatHanh > 12) {
            throw new RuntimeException("Tháng phát hành không hợp lệ!");
        }
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        if (soPhatHanh <= 0) {
            throw new RuntimeException("Số phát hành phải dương");
        }
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        if (thangPhatHanh < 1 || thangPhatHanh > 12) {
            throw new RuntimeException("Tháng phát hành không hợp lệ!");
        }
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" + super.toString() +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
