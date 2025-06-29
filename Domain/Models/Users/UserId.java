package Domain.Models.Users;

public class UserId {
    private final String value;

    public UserId(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("空のUserIdが渡されました");
        }
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof UserId)) return false;
        UserId otherUserId = (UserId) other;
        return value.equals(otherUserId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "UserId{" +
               "value='" + value + '\'' +
               '}';
    }
}

