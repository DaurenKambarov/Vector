public class CustomerRecord implements DatabaseRecord {
    public String data;

    public CustomerRecord(String data) {
        this.data = data;
    }

    @Override
    public String getType() {
        return "Customer";
    }

    @Override
    public String toString() {
        return "Customer Record: " + data;
    }
}
