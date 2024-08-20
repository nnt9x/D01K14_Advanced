package day1.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tao doi tuong hinh chu nhat
        HinhChuNhat hcn1 = new HinhChuNhat(10, 20);
        HinhChuNhat hcn2 = new HinhChuNhat(20, 30);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a, b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a <= 0 || b <= 0) {
            System.out.println("Cạnh không hợp lệ");
        } else {
            HinhChuNhat hcn3 = new HinhChuNhat(a, b);
        }

        double cv1 = hcn1.chuVi();
        double cv2 = hcn2.chuVi();

        // In ra trung binh cong chu vi
        System.out.println((cv1 + cv2) / 2);

    }
}
