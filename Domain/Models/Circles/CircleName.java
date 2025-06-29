package Domain.Models.Circles;

public class CircleName {
    private final String value;

    public CircleName(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("空のCircleNameが渡されました");
        }
        if (value.length() < 3 || value.length() > 21) {
            throw new IllegalArgumentException("サークル名は3文字以上、20文字以内です");
        }
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof CircleName)) return false;
        CircleName otherCircleName = (CircleName) other;
        return value.equals(otherCircleName.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "CircleName{" +
               "value='" + value + '\'' +
               '}';
    }
}
