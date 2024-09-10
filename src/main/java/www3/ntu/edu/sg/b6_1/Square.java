package www3.ntu.edu.sg.b6_1;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        length = side;
        width = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width; // hoac length
    }

    public void setSide(double side) {
        width = length = side;
    }

    @Override
    public void setLength(double side) {
        length = width = side;
    }

    @Override
    public void setWidth(double side) {
        length = width = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
