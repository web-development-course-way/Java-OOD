public class Debit extends PaymentProcessor {
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing Debit Payment logic...");
        // Update order status
        super.processPayment(order);
    }
}