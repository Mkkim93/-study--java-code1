package collection.set.member;

// hash 와 equals 미구현
public class MemberNoHashEq {

    private String id;

    public MemberNoHashEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
