public class PushNotification implements INotification {
    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Sending a Mobile Notification:: " + order.toString());
    }
}
