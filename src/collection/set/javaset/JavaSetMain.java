package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>()); // HashSet<> : hashCode 기반의 순서대로 출력 : O(1)
        run(new LinkedHashSet<>()); // LinkedHashSet<> : 입력한 순서대로 출력 : O(1)
        run(new TreeSet<>()); // TreeSet<> : 순서 정렬 후 출력 : O(log n)
        
    }

    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) { // 다음 데이터가 있는지 확인한다.
            System.out.print(iterator.next() + " "); // 다음 데이터를 반환한다.
        }
        System.out.println();
    }
}
