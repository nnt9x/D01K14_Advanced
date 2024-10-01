package day7.dip;

public class OrderSystem {
    private EmailNotification emailNotification;

    public OrderSystem() {
        this.emailNotification = new EmailNotification();
    }

    public void handleOrder(){
        // Logic xử lý đơn

        // Thông báo về email
        this.emailNotification.notification("Gửi email: Đã xử lý đơn hàng");
    }
}
