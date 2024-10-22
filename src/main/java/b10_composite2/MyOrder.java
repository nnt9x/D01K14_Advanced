package b10_composite2;

import java.util.ArrayList;
import java.util.List;

public class MyOrder implements Order {
    private List<Order> items;

    public MyOrder() {
        this.items = new ArrayList<>();
    }

    public void add(Order order) {
        items.add(order);
    }

    public void remove(Order order) {
        items.remove(order);
    }

    public List<Order> getItems() {
        return items;
    }

    @Override

    public int amount() {
        int total = 0;
        for (Order o : items) {
            total += o.amount();
        }
        return total;
    }

    @Override
    public void print() {
        for (Order o : items) {
            o.print();
        }
    }
}
