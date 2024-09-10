package oop.bai12;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }

    @Override
    public void erase() {
        System.out.println("Xoá hình tròn");
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("Di chuyển hình tròn đến toạ độ (%d,%d) \n", x, y);
    }
}
