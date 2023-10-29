public class DataBaseRecordFact {
    public static DatabaseRecord createRecord(String type, String data) {
        if ("Customer".equalsIgnoreCase(type)) {
            return new CustomerRecord(data);
        } else if ("Order".equalsIgnoreCase(type)) {
            return new OrderRecord(data);
        }
        return null;
    }
}
