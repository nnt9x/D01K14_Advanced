package b9_adapter.exits;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        if (radius > peg.getRadius()) {
            return true;
        }
        return false;
    }
}
