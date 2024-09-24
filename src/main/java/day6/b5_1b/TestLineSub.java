package day6.b5_1b;

import day6.b5_1a.Line;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub = new LineSub(0, 0, 3, 4);
        // Tinh khoang cach
        System.out.println(lineSub);
        System.out.println(lineSub.getLength());

        Point p1 = new LineSub(4, 5, 6, 7);

    }
}