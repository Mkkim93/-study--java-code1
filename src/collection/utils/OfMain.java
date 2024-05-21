package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        // .of : 편리한 불변 컬렉션
        List<Integer> list = List.of(1, 2, 3); // 변경이 불가능한 list 생성 (값을 넣거나 뺴거나 수정할 수 없다)
        Set<Integer> set = Set.of(1,2,3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        // list.add(1);

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
    }
}
