package b9_adapter2;

public class Main {
    public static void main(String[] args) {
        // He thong
        AmazonSystem amazonSystem = new AmazonSystem("amazon");
        // Phuong thuc thanh toan mac dinh
        GlobalPayment globalPayment = new GlobalPayment("global");
        int amount = 100; // 100$
        if (amazonSystem.payment(globalPayment, amount)) {
            System.out.println("Payment success: " + amount + " $");
        }
        // Co phuong thuc thanh toan: VietnamesePayment
        VietnamesePaymentAdapter vietnamesePaymentAdapter = new VietnamesePaymentAdapter("adapter");
        amazonSystem.payment(vietnamesePaymentAdapter, amount);
    }
}
