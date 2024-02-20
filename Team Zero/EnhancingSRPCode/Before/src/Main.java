public class Main {
    private static void doSRP() {
        Order order = new Order();
        order.addItem("Laptop", 1000.0);
        order.addItem("Mouse", 40.0);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(order, "CREDIT");

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendOrderConfirmationEmail(order);
    }
    public static void main(String[] args) {
        doSRP();
    }
}