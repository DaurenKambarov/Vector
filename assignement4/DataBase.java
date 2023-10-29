import java.util.ArrayList;
import java.util.List;
class DataBase{
    private List<DatabaseObserver> observers = new ArrayList<>();

    public void addObserver(DatabaseObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DatabaseObserver observer) {
        observers.remove(observer);
    }

    public void insertData(DatabaseRecord record) {
        System.out.println("Inserting data into the database...");
        notifyObservers(record);
    }

    private void notifyObservers(DatabaseRecord record) {
        for (DatabaseObserver observer : observers) {
            observer.update(record);
        }
    }
}