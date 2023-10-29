public class UserObserver implements DatabaseObserver {
    private String username;

    public UserObserver(String username) {
        this.username = username;
    }

    @Override
    public void update(DatabaseRecord record) {
        System.out.println(username + " received data: " + record.toString());
    }
}
