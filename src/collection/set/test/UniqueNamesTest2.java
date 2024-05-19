package collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<Integer>(List.of(inputArr));
        for (Integer s : set) {

            // 입력되는 값을 [] 배열로 만들어주는 메서드는 아래와 같다.
            // List<Integer> list1 = Arrays.asList(1, 2, 3);
            // List<Integer> list2 = List.of(1, 2, 3);

        }
        System.out.println("set = " + set);


    }
}
