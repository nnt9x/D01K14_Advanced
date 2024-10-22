package b9_adapter2;

public class VietnamesePaymentAdapter extends GlobalPayment {

    private final VietnamesePayment vietnamesePayment;

    public VietnamesePaymentAdapter(String key) {
        super(key);
        this.vietnamesePayment = new VietnamesePayment();
    }

    @Override
    public boolean payment(int amount) {
        // chuyen amount usd => vnd
        amount = amount * 25000;
        // Thanh toan vietnamese
        boolean result = vietnamesePayment.pay(amount);
        if (result) {
            System.out.println("Thành công: " + amount + " VND");
        }
        return result;
    }
}
