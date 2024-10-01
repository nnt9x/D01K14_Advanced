package day7.dip2;

public class OrderSystem {
    private Notification notification;

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void handleOrder(){
        // logic xu ly hoa don

        // Thong bao
        notification.notification("Đã gửi thông báo");
    }
}
