package b6_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(5);
        GeometricObject g2 = new Rectangle(5, 6);
        GeometricObject g3 = new Square(6);
        GeometricObject g4 = new Rectangle(10, 6);

        List<GeometricObject> geometricObjects = new ArrayList<>();
        geometricObjects.add(g1);
        geometricObjects.add(g2);
        geometricObjects.add(g3);
        geometricObjects.add(g4);

        for (int i = 0; i <  geometricObjects.size(); i++) {
            GeometricObject g = geometricObjects.get(i);
            System.out.println(g);
            System.out.printf("Chu vi: %.2f, diện tích: %.2f \n", g.getPerimeter(), g.getArea());
        }
    }

}
