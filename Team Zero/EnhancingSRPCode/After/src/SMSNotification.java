public class SMSNotification implements INotification {
    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Sending a SMS:: " + order.toString());
    }
}


