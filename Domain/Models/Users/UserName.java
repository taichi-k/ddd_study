package Domain.Models.Users;

public class UserName {
    private final String value;

    public UserName(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("空のUserNameが渡されました");
        }
        if (value.length() < 3) {
            throw new IllegalArgumentException("ユーザ名は3文字以上です");
        }
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof UserName)) return false;
        UserName otherUserName = (UserName) other;
        return value.equals(otherUserName.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "UserName{" +
               "value='" + value + '\'' +
               '}';
    }
}
