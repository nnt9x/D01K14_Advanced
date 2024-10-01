package day7.dip2;

public class ZaloNotification implements Notification{
    @Override
    public void notification(String msg) {
        System.out.print("Zalo: ");
        System.out.println(msg);
    }
}
