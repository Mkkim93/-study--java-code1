package collection.set.member;

import collection.set.MyHashSetV2;
/**
 *  hashCode() 와 equals() 를 구현하지 않으면 문제점
 *  1. 등록이 중복되는 현상 hashSet() 은 등록이 중복되는 것을 허용하지 않음
 *  2. 검색이 불가능하다.
 * */

public class HasAndEqualsMain1 {

    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);

        MemberNoHashEq m1 = new MemberNoHashEq("A");
        MemberNoHashEq m2 = new MemberNoHashEq("A");

        System.out.println("m1.hashCode = " + m1.hashCode());
        System.out.println("m2.hashCode = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // hashCode 와 equals 가 없는 경우 등록이 중복된다.
        set.add(m1);
        set.add(m2);

        System.out.println("set = " + set);

        // 검색 실패
        MemberNoHashEq searchValue = new MemberNoHashEq("A");
        int result = searchValue.hashCode();
        System.out.println("result = " + result);
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue)); // 검색 실패
    }
}
