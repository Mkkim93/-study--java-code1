package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {

        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변 리스트 전환 (쉽게 말해 인스턴스 객체를 mutableList 라는 ArrayList 객체로 새로 생성 하는 것) list -> mutableList
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);

        // 불변 리스트로 전환
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        // unmodifiableList.add(5); : 예외 발생
    }
}
