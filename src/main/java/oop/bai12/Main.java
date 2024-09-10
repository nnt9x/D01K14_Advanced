package oop.bai12;

public class Main {
    public static void main(String[] args) {
        // 3 doi tuong shape
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape quad = new Quad();
        // Ve ra 3 hinh lop drawing
        Drawing drawing = new Drawing();
        drawing.drawShape(circle);
        drawing.drawShape(rectangle);
        drawing.drawShape(quad);
    }
}
