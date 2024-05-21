package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator(); // 반복자(iterator) 생성

        System.out.println("iterator 사용");
        while (iterator.hasNext()) { // hashNext() 에서 다음 값을 확인한다 있으면 아래 반복문 시작
            Integer value = iterator.next(); // hashNext() 에서 다음값을 확인 했으니 next() 메서드를 실행하여 다음 값 반환
            System.out.println("value = " + value); // value 출력 (hashNext() 가 false 가 될때까지 반복)
        }

        System.out.println("for-each 사용");
        for(int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
