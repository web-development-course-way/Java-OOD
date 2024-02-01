public class OrderRepository {
    public Database database;
    public OrderRepository(Database database) {
        this.database = database;
    }

    public void persistToDB(Order order) {
        database.persistToDB(order);
    }
}