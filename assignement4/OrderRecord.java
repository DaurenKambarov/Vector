public class OrderRecord implements DataBaseRecord{
    private String data;

    public OrderRecord(String data) {
        this.data = data;
    }

    @Override
    public String getType() {
        return "Order";
    }

    @Override
    public String toString() {
        return "Order Record: " + data;
    }
}
