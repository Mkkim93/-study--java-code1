package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {

        Integer[] arry = {3, 2, 1};
        System.out.println(Arrays.toString(arry));
        System.out.println("Comparator 비교");

        Arrays.sort(arry, new AscComparator()); // ASC 오름차순
        System.out.println("AscComparator : " + Arrays.toString(arry));

        Arrays.sort(arry, new DescComparator()); // DESC 내림차순
        System.out.println("DescComparator : " + Arrays.toString(arry));

        Arrays.sort(arry, new AscComparator().reversed()); // 오름차순을 내림차순으로 변경, DESC 와 같음 (reversed())
        System.out.println("AscComparator.reversed : " + Arrays.toString(arry) );

    }

    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + o2);
            // [2, 1, 3] : 첫번째 비교 3을 2와 1과 비교해서 젤 뒤에 배치한다
            // [1, 2, 3] : 2와 1을 비교해서 2를 1뒤에 배치한다.
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + o2);
            // * -1 의 의미
            // 1의 결과 값에  * -1을 하면 -1이 된다, -1의 결과 값에 * -1을 하면 1이 된다.
            // 즉 결과가 반대로 뒤집힌다는 의미
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
