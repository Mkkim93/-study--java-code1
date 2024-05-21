package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(100);
        list.add(4);
        list.add(5);

        // Collections 의 다양한 유틸 메서드 제공
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);

        Collections.shuffle(list); // shuffle : 랜덤하게 list 요소를 섞는다.
        System.out.println("shuffle list = " + list);

        Collections.sort(list); // list.sort() 와 동일한 메서드
        System.out.println("sort list = " + list);

        Collections.reverse(list);
        System.out.println("reverse list = " + list);
    }

}
