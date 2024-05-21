package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {

        // 1. List<> 의 iterator
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        foreach(list);

        // 2. Set<> 의 iterator
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> iterator1 = set.iterator();
        printAll(iterator1);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }

    // foreach 구현 : foreach 가 있으려면 iterable 이 존재해야된다.
    private static void foreach(Iterable<Integer> list) {
        System.out.println("iterable" + list.getClass());
        for (Integer value : list) {
            System.out.println("value = " + value);
        }
    }
}
