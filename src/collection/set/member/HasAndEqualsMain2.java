package collection.set.member;

import collection.set.MyHashSetV2;

/**
 *  hashCode() 만 구현하고, equals() 를 구현하지 않으면 문제점
 *  1.검색이 불가능하다.
 *  2. data 의 중복 저장 (같은 인덱스에 같은 해시코드는 들어감)
 * */

public class HasAndEqualsMain2 {

    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);

        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        // 같은 해시코드의 경우 같은 인덱스에는 감싸진다.
        MemberOnlyHash m3 = new MemberOnlyHash("B");
        MemberOnlyHash m4 = new MemberOnlyHash("SET");


        System.out.println("m1.hashCode = " + m1.hashCode());
        System.out.println("m2.hashCode = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 참조 값 비교
        // 1. m1, m2 는 서로 다른 참조 값을 가진다 애초에
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        // 2. hashCode 로 출력했을 때는 참조 값이 달라도 같은 해시코드를 가진다.
        System.out.println("System.identityHashCode(m1.hashCode()) = " + System.identityHashCode(m1.hashCode()));
        System.out.println("System.identityHashCode(m2.hashCode()) = " + System.identityHashCode(m2.hashCode()));

        // hashCode 와 equals 가 없는 경우 등록이 중복된다.
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);

        System.out.println("set = " + set);

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        int result = searchValue.hashCode();
        System.out.println("result = " + result);
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue)); // 검색 실패
    }
}
