package Domain.Models.Circles;

import Domain.Models.Users.*;


public class Circle {
    private final CircleId id;
    private final CircleName name;
    private final User owner;
    private final User[] members;

    public Circle(CircleId id, CircleName name, User owner, User[] members) {
        if (id == null) throw new IllegalArgumentException("CircleIdがnullです");
        if (name == null) throw new IllegalArgumentException("CircleNameがnullです");
        if (owner == null) throw new IllegalArgumentException("ownerがnullです");
        if (members == null) throw new IllegalArgumentException("membersがnullです");

        this.id = id;
        this.name = name;
        this.owner = owner;
        this.members = members;
    }

    public CircleId getId() {
        return this.id;
    }

    public CircleName getName() {
        return this.name;
    }

    public User getOwner() {
        return this.owner;
    }

    public User[] getMembers() {
        return this.members;
    }
}
