package oop.bai10;

public class Main {
    public static void main(String[] args) {
        DaGiac daGiac = new DaGiac(4, new float[]{1.5f, 2.5f, 3.5f, 4.5f});
        System.out.println("Chu vi:" + daGiac.chuVi());
        daGiac.inCanh();

        TamGiac tg = new TamGiac(new float[]{3, 4, 5});
        System.out.println(tg.chuVi());
        System.out.println(tg.dienTich());
        tg.inCanh();


    }
}
