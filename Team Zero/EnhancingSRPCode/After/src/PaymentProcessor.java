public abstract class PaymentProcessor {
    public void processPayment(Order order) {
        // Update order status
        order.setStatus("PAID");
        System.out.println(order.getStatus());
    }
}


