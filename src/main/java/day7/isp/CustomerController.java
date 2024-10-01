package day7.isp;

public class CustomerController implements ViewProduct, Payment {
    @Override
    public void viewProduct() {
        System.out.println("Customer có thể xem sản phẩm");
    }

    @Override
    public boolean payment(int amount) {
        // Xu ly chi tiet
        return false;
    }
}
