package b9_adapter;

import b9_adapter.exits.RoundPeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
