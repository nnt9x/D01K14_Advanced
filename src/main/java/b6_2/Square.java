package b6_2;

public class Square implements GeometricObject {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        if (side <= 0) {
            throw new RuntimeException("Cạnh không hợp lệ!");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square[" +
                "side=" + side +
                ']';
    }
}
