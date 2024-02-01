public class Postgres implements Database {
    public void persistToDB(Order order) {
        // Logic to save the order to the DB
        System.out.println("Order saved to Postgres");
    }
}
