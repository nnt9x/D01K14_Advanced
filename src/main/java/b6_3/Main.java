package b6_3;

public class Main {
    public static void main(String[] args) {
        Movable point = new MovablePoint(1,1,1,1);
        System.out.println(point);
        // Di chuyen sang phai
        System.out.println("Sang phải: ");
        point.moveRight();
        System.out.println(point);
        // Di chuyen xuong duoi
        System.out.println("Xuống dưới: ");
        point.moveDown();
        System.out.println(point);
        // Di chuyen sang trai
        System.out.println("Sang trái: ");
        point.moveLeft();
        System.out.println(point);
        // Di chuyen len tren
        System.out.println("Lên trên: ");
        point.moveUp();
        System.out.println(point);
    }
}
