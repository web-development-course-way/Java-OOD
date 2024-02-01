public class Credit extends PaymentProcessor {
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing Credit Payment logic...");
        // Update order status
        super.processPayment(order);
    }
}

