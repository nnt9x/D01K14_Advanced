package b9_adapter2;

public class AmazonSystem {
    private String key;

    public AmazonSystem(String key) {
        this.key = key;
    }

    public boolean payment(GlobalPayment payment, int amount) {
        return payment.payment(amount);
    }
}
