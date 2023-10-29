public class Main {
    public static void main(String[] args){
        Database database = new Database();

        // Create user observers
        UserObserver user1 = new UserObserver("User1");
        UserObserver user2 = new UserObserver("User2");

        // Add user observers to the database
        database.addObserver(user1);
        database.addObserver(user2);

        // Insert database records using the Factory
        DatabaseRecord customerRecord = DatabaseRecordFactory.createRecord("Customer", "John Doe");
        DatabaseRecord orderRecord = DatabaseRecordFactory.createRecord("Order", "Order #12345");

        database.insertData(customerRecord);
        database.insertData(orderRecord);
    }
}