public class EmailNotification implements INotification {
    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Sending an email:: " + order.toString());
    }
}

