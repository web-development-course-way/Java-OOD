public class PaymentProcessor {
    public void processPayment(Order order, String paymentType) {
        // Process payment logic
        // Update order status
        order.setStatus("PAID");
        System.out.println(order.getStatus());
    }
}
