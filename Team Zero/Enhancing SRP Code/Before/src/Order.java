import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<String> items;
    private double totalCost;
    private String status;

    public Order() {
        items = new ArrayList<>();
        totalCost = 0.0;
        status = "New";
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", totalCost=" + totalCost +
                ", status=" + status +
                '}';
    }

    public void addItem(String item, double cost) {
        items.add(item);
        totalCost += cost;
    }
    public double getTotalCost() {
        return totalCost;
    }
}

