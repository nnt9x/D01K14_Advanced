package b9_adapter;

import b9_adapter.exits.RoundHole;
import b9_adapter.exits.RoundPeg;

public class Main2 {
    public static void main(String[] args) {
        // round hole
        RoundHole roundHole = new RoundHole(5);
        // roundpeg
        RoundPeg roundPeg1 = new RoundPeg(3);
        RoundPeg roundPeg2 = new RoundPeg(6);
        if(roundHole.fits(roundPeg1)){
            System.out.println("roundpeg1 lọt qua");
        }
        else{
            System.out.println("roundpeg1 không lọt qua");
        }

        if(roundHole.fits(roundPeg2)){
            System.out.println("roundpeg2 lọt qua");
        }
        else{
            System.out.println("roundpeg2 không lọt qua");
        }
        // square peg -> kiểm tra xem nó có lọt qua hay ko?
        SquarePeg squarePeg = new SquarePeg(5);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        if(roundHole.fits(squarePegAdapter)){
            System.out.println("square peg lọt qua");
        }
        else{
            System.out.println("square peg không lọt qua");
        }




    }
}
