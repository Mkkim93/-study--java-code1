package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {

        // Integer[] inputArr = {30, 20, 20, 10, 10}; - List.of 를 사용하여 생략 가능
        Set<Integer> set = new TreeSet<Integer>(List.of(30, 20, 20, 10, 10));
        for (Integer s : set) {

        }
        System.out.println("set = " + set);

    }
}
