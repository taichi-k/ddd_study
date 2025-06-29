package Domain.Models.Circles;

public class CircleId {
    private final String value;

    public CircleId(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("空のCircleIdが渡されました");
        }
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof CircleId)) return false;
        CircleId otherCircleId = (CircleId) other;
        return value.equals(otherCircleId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "CircleId{" +
               "value='" + value + '\'' +
               '}';
    }
}
