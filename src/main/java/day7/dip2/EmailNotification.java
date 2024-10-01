package day7.dip2;

public class EmailNotification implements Notification{

    // Logic de ket noi - dang nhap - xac thuc email

    @Override
    public void notification(String msg) {
        System.out.print("Email: ");
        System.out.println(msg);
    }
}
