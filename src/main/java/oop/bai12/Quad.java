package oop.bai12;

public class Quad extends Shape {
    protected String name = "Hình tứ giác";

    @Override
    public void draw() {
        System.out.printf("Vẽ %s \n", name);
    }

    @Override
    public void erase() {
        System.out.printf("Xoá %s \n", name);
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("Di chuyển %s đến toạ độ (%d,%d) \n", name, x, y);
    }
}
