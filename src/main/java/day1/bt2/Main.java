package day1.bt2;

public class Main {
    public static void main(String[] args) {
        // Tao doi tuong
        ThiSinh ts1 = new ThiSinh("TH1", "Thí Sinh 1");
        ts1.diemToan = 10;
        ts1.diemVan = 8;
        ts1.diemTiengAnh = 9;

        // Voi cac thi sinh còn lại -> nhập đầy đủ tham số
        ThiSinh ts2 = new ThiSinh("TH2", "Thí sinh 2", "2000-01-01", "Nam", 10, 9, 10);
        ThiSinh ts3 = new ThiSinh("TH3", "Thí sinh 3", "2000-01-01", "Nữ", 8, 7, 10);
        ThiSinh ts4 = new ThiSinh("TH4", "Thí sinh 4", "2000-01-01", "Nam", 6, 10, 5);
        ThiSinh ts5 = new ThiSinh("TH5", "Thí sinh 5", "2000-01-01", "Nữ", 10, 8, 10);
        ThiSinh ts6 = new ThiSinh("TH6", "Thí sinh 6", "2000-01-01", "Nam", 8, 9, 10);
        ThiSinh ts7 = new ThiSinh("TH7", "Thí sinh 7", "2000-01-01", "Nữ", 5, 8, 8);
        ThiSinh ts8 = new ThiSinh("TH8", "Thí sinh 8", "2000-01-01", "Nam", 4, 9, 10);
        ThiSinh ts9 = new ThiSinh("TH9", "Thí sinh 9", "2000-01-01", "Nam", 7, 10, 10);
        ThiSinh ts10 = new ThiSinh("TH10", "Thí sinh 10", "2000-01-01", "Nam", 10, 10, 10);

        // Tạo mảng 10 đối tượng
        ThiSinh arr[] = {ts1, ts2, ts3, ts4, ts5, ts6, ts7, ts8, ts9, ts10};
        // In ra thong tin diem trung binh tung ban
        for (int i = 0; i < arr.length; i++) {
            double tb = (arr[i].diemToan + arr[i].diemVan + arr[i].diemTiengAnh) / 3;
            System.out.printf("Mã: %s, họ tên: %s, điểm trung bình: %.2f \n", arr[i].maThiSinh, arr[i].hoTen, tb);
        }
        // In ra diem TB môn Toán
        double tbToan = 0;
        for (int i = 0; i < arr.length; i++) {
            tbToan += arr[i].diemToan;
        }
        System.out.println("Điểm TB môn Toán: " + tbToan/ arr.length);

        // In ra điểm TB môn Văn
        double tbVan = 0;
        for (int i = 0; i < arr.length; i++) {
            tbVan += arr[i].diemVan;
        }
        System.out.println("Điểm TB môn Văn: " + tbVan/ arr.length);

    }
}
