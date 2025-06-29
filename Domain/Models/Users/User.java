package Domain.Models.Users;

public class User {
    private final UserId id;
    private final UserName name;

    public User(UserId id, UserName name) {
        if (id == null) throw new IllegalArgumentException("UserIdがnullです");
        if (name == null) throw new IllegalArgumentException("UserNameがnullです");

        this.id = id;
        this.name = name;
    }

    public UserId getId() {
        return this.id;
    }

    public UserName getName() {
        return this.name;
    }
}
