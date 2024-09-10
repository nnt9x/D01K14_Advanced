package b6_2;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Bán kính phải dương!");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
