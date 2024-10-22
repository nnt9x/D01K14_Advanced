package b9_adapter2;

public class GlobalPayment {
    private String key;

    public GlobalPayment(String key) {
        this.key = key;
    }

    public boolean payment(int amount) {
        if (amount <= 0) {
            return false;
        }
        return true;
    }
}
