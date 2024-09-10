package b6_2;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0) {
            throw new RuntimeException("Kích thước cạnh phải dương");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
}
