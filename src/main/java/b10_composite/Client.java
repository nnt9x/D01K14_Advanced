package b10_composite;

public class Client {
    public static void main(String[] args) {
        // Tao 3 box
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        // Box1 chua box2 va box 3
        box1.add(box2);
        box1.add(box3);

        // Box2: chua 2 cuon sach
        Book book1 = new Book("Book 1", "BKACAD", 1000);
        Book book2 = new Book("Book 2", "BKACAD", 2500);

        box2.add(book1);
        box2.add(book2);

        Book miniBook = new Book("Book 3", "MINI", 400);
        Box miniBox = new Box();
        miniBox.add(miniBook);

        // Them miniBox -> box2
        box2.add(miniBox);

        // Box3: chua 1 dien thoai
        Phone phone = new Phone("Iphone 16 Pro Max", 5000);
        box3.add(phone);

        // Tinh tien
        System.out.println(box1.getPrice());
        // Tinh cu the tung box
        System.out.println(box2.getPrice());

    }
}
