package collection.set;

public class MyHashSetV3Main {

    public static void main(String[] args) {

        MySet<String> set = new MyHashSetV3<>(10); // 인터페이스로 구현한 기능을 MyHashSetV3 을 사용

        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);

        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(searchValue) = " + searchValue + " result = " + result);
    }
}
