package day5;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(3, 4);
        shape.draw();

        Rectangle square = new Square(5);
        square.setWidth(5);
        square.setWidth(10);
        System.out.println(square);
        // Vi pham quy tac

    }
}
