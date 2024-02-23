public class Main {
    private static void doSOLID() {
        Order order = new Order();
        order.addItem("Laptop", 1000.0);
        order.addItem("Mouse", 40.0);

        //////////// Payment (LSP) ////////////
        PaymentProcessor credit = new Credit();
        credit.processPayment(order);

        PaymentProcessor debit = new Debit();
        debit.processPayment(order);

        //////////// Persisting to DB (DIP) ////////////
        Database postgres = new Postgres();
        OrderRepository repo = new OrderRepository(postgres);
        repo.persistToDB(order);

        Database mongo = new MongoDB();
        repo = new OrderRepository(mongo);
        repo.persistToDB(order);

        //////////// Notifications (OCP) ////////////
        INotification emailNotification = new EmailNotification();
        emailNotification.sendOrderConfirmation(order);

        INotification smsNotification = new SMSNotification();
        smsNotification.sendOrderConfirmation(order);

        INotification pushNotification = new PushNotification();
        pushNotification.sendOrderConfirmation(order);
    }
    public static void main(String[] args) {
        doSOLID();
    }
}