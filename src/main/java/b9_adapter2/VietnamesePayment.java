package b9_adapter2;

public class VietnamesePayment {
    public VietnamesePayment() {
    }

    // Don vi: vnd
    public boolean pay(int amount) {
        if (amount < 0) {
            return false;
        }
        return true;
    }
}
