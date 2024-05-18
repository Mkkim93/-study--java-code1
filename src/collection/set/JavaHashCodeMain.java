package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {

        // Object 의 기본 hashCode 는 객체의 참조값을 기반으로 생성

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        // obj1 의 16진수 (참조값)
        System.out.println("obj1 = " + obj1);
        System.out.println(Integer.toHexString(obj1.hashCode()));

        // 각 클래스마다 hashCode 를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("srtAB.hashCode() = " + strAB.hashCode());

        // hashCode 에는 - 값이 들어올 수 있다.
        System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? 다른 참조 값을 가진다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        // hashCode() 를 오버라이딩할 때 Object 로 묶기 때문에 참조가 달랐지만 같은 해시코드를 가지게 된다.
        boolean equals = member1.equals(member2);
        System.out.println("equals = " + equals);

        System.out.println("member1 == member2 = " + (member1 == member2));

        System.out.println("member1 = " + member1.hashCode());
        System.out.println("member2 = " + member2.hashCode());
    }
}
