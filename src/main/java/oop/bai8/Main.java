package oop.bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tao mang chua tai lieu
        List<TaiLieu> taiLieuList = new ArrayList<>();
        // Tao cac doi tuong
        taiLieuList.add(new Bao("Bao 1","Thanh Nien",1000,"2024-01-01"));
        taiLieuList.add(new Sach("Sach 1","Nhi Dong",2000,"Nguyen Van A",200));
        taiLieuList.add(new TapChi("Tap Chi ","A",1000,10, 8));
        taiLieuList.add(new Bao("Bao 2","Thanh Nien",1000,"2024-01-01"));
        taiLieuList.add(new Sach("Sach 2","Nhi Dong",2000,"Nguyen Van A",200));
        taiLieuList.add(new TapChi("Tap Chi 2","A",1000,10, 8));

        // In ra thong tin
        for (int i = 0; i < taiLieuList.size(); i++){
            System.out.println(taiLieuList.get(i).toString());
        }
        // Tim kiem theo loai
        System.out.println(taiLieuList.get(0).getClass().getSimpleName());
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thể loại cần tìm: ");
        String type = sc.nextLine();
        for (int i = 0; i < taiLieuList.size(); i++) {
            if(taiLieuList.get(i).getClass().getSimpleName().equals(type)){
                System.out.println(taiLieuList.get(i));
            }
        }
        sc.close();
    }
}
