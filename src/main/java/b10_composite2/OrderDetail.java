package b10_composite2;

import b10_composite2.products.Product;

public class OrderDetail implements Order {
    private Product product;
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int amount() {
        return product.getPrice() * quantity;
    }

    @Override
    public void print() {
        System.out.print("Product:" + product);
        System.out.println(", quantity:" + quantity);
    }
}
