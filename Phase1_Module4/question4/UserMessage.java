package question4;

public class UserMessage {
    private User user;
    private String type;

    public UserMessage() { }

    public UserMessage(String type, User user) {
        this.user = user;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
