package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list class = " + list.getClass());
        // synchronizedList : 멀티쓰레드 상황에서 첫번쨰 작업이 끝날때까지 두번쨰 작업이 기다리게 만듦
        List<Integer> synchronizedList = Collections.synchronizedList(list); // 일반 list 를 멀티 쓰레드 상황에서 사용할 수 있는 리스트로 만듦

    }
}
