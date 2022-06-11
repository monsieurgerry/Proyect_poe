package pub;

public class User {
    public String username;
    private String password;
    private User next;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.next = null;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public User getNext() { return next; }

    public void setNext(User next) { this.next = next; }
}
