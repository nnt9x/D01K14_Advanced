package b10_composite2;

import b10_composite2.products.Book;
import b10_composite2.products.PC;
import b10_composite2.products.Product;

public class Main {
    public static void main(String[] args) {
        // Tao san pham
        Book book1 = new Book("Book 1", "BKACAD", 100);
        Book book2 = new Book("Book 2", "BKACAD", 200);

        PC pc1 = new PC("PC1", "PC1", "...", 1000);

        // Tao hoa don: order
        MyOrder myOrder = new MyOrder();
        // Tao cac hoa don chi tiet, tinh tien va in ra
        // Mua 2 sach va 1 may tinh
        myOrder.add(new OrderDetail(pc1, 1));
        myOrder.add(new OrderDetail(book1, 1));
        myOrder.add(new OrderDetail(book2, 2));

        // Tinh tien va in
        System.out.println("Tong tien: " + myOrder.amount());
        myOrder.print();

    }
}
