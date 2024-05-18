package collection.set.member;

import collection.set.MyHashSetV2;

/**
 *  hashCode(), equals() 모두 구현 (정상)
 *  1. 중복 등록 안됨
 *  2. 검색 성공
 *  3. 같은 인덱스에 같은 해시코드(데이터) 저장
 * */

public class HasAndEqualsMain3 {

    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);

        Member m1 = new Member("A");
        Member m2 = new Member("A");

        // 같은 해시코드의 경우 같은 인덱스에는 감싸진다.
        Member m3 = new Member("B");
        Member m4 = new Member("SET");


        System.out.println("m1.hashCode = " + m1.hashCode());
        System.out.println("m2.hashCode = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 참조 값 비교
        // 1. m1, m2 는 서로 다른 참조 값을 가진다 애초에
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));


        System.out.println("System.identityHashCode(m1.hashCode()) = " + System.identityHashCode(m1.hashCode()));
        System.out.println("System.identityHashCode(m2.hashCode()) = " + System.identityHashCode(m2.hashCode()));

        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);

        System.out.println("set = " + set);

        // 검색 실패
        Member searchValue = new Member("A");
        int result = searchValue.hashCode();
        System.out.println("result = " + result);
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));
    }
}
