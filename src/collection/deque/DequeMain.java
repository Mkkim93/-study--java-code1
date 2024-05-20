package collection.deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offerFirst(1); // 데이터를 추가한다 [1]
        System.out.println("deque = " + deque);
        deque.offerFirst(2); // 데이터를 가장 앞에 추가한다 [2, 1]
        System.out.println("deque = " + deque);
        deque.offerLast(3); // 데이터를 가장 뒤에 추가 한다 [2, 1, 3]
        System.out.println("deque = " + deque);
        deque.offerLast(4); // 데이터를 가장 뒤에 추가 한다 [2, 1, 3, 4]
        System.out.println("deque = " + deque);

        // 다음 꺼낼 데이터 확인 (peek())
        System.out.println("deque.peekFirst() = " + deque.peekFirst()); // [2, 1, 3, 4] 중 가장 앞의 데이터 확인
        System.out.println("deque.peekLast() = " + deque.peekLast()); // [2, 1, 3, 4] 중 가장 뒤의 데이터 확인

        // 데이터 꺼내기 [2, 1, 3, 4]
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 가장 앞의 데이터 꺼냄 2
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 앞의 2 꺼낸 뒤 그다음 앞인 1를 꺼냄
        System.out.println("deque.pollLast() = " + deque.pollLast());  // 가장 뒤에 있는 4 를 꺼냄
        System.out.println("deque.pollLast() = " + deque.pollLast()); // 마지막으로 남은 데이터 3을 꺼냄

        System.out.println("deque = " + deque);
    }
}
