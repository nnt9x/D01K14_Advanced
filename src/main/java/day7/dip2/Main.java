package day7.dip2;

public class Main {
    public static void main(String[] args) {
        // Thong bao
        Notification notification1 = new ZaloNotification();
        Notification notification2 = new EmailNotification();
        Notification notification3 = new PhoneNotification();

        // Thong bao qua zalo
        OrderSystem orderSystem = new OrderSystem();
        orderSystem.setNotification(notification1);
        orderSystem.handleOrder();

        // Thong bao qua sdt
        orderSystem.setNotification(notification3);
        orderSystem.handleOrder();

    }
}
