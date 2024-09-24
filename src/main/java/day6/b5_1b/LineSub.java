package day6.b5_1b;

public class LineSub extends Point {

    private Point end;

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }

    public LineSub(Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "begin" + super.toString() +
                ",end=" + end +
                '}';
    }

    public Point getBegin() {
        return this;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        this.setX(begin.getX());
        this.setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setX(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = getX() - end.getX();
        int yDiff = getY() - end.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getX() - end.getX();
        int yDiff = getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
