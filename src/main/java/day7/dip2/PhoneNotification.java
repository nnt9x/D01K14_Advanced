package day7.dip2;

public class PhoneNotification implements Notification{
    @Override
    public void notification(String msg) {
        System.out.print("Gửi từ SĐT: ");
        System.out.println(msg);
    }
}
