package oop.bai12;

public class Rectangle extends Quad {
    public String color = "đỏ";

    public Rectangle() {
        this.name = "Hình chữ nhật";
    }

    public Rectangle(String color) {
        this.color = color;
        this.name = "Hình chữ nhật";
    }

    @Override
    public void draw() {
        System.out.println("Vẽ ra hình chữ nhật, màu " + color);
    }
}
