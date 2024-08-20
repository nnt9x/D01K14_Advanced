package day1;

public class Main {
    public static void main(String[] args) {
        // Đối tượng xe 1, xe 2
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.color = "Black";

        Car car2 = new Car();
        car2.name = "Honda";
        car2.color = "White";

        // In ra thông tin cơ bản của xe
        // Tên xe - màu sắc
        System.out.println(car1.info());
        System.out.println(car2.info());
    }
}
