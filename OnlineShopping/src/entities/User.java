package entities;

public abstract class User {
    public int userId;
    protected String username;
    protected String email;

    public User(int userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Username: " + username + ", Email: " + email;
    }
}
