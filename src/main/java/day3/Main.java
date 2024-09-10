package day3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HinhHoc hinhVuong = new HinhVuong(5);
        HinhHoc hinhTron = new HinhTron("Đỏ", 3);

        // List hinh hoc, tim ra hinh co dien tich lon nhat
        List<HinhHoc> hinhHocList = new ArrayList<>();
        hinhHocList.add(hinhVuong);
        hinhHocList.add(hinhTron);
        // Duyet danh sach
        for (int i = 0; i < hinhHocList.size(); i++) {
            System.out.println(hinhHocList.get(i));
        }
    }
}
