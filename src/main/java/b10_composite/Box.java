package b10_composite;

import java.util.LinkedList;
import java.util.List;

public class Box implements Product {
    private List<Product> items;


    public Box() {
        this.items = new LinkedList<>();
    }

    public void add(Product p) {
        items.add(p);
    }

    public void remove(Product p) {
        items.remove(p);
    }

    public List<Product> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        int total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
