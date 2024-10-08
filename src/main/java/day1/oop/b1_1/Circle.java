package day1.oop.b1_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
