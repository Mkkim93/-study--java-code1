package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<Integer>();

        // 데이터 추가
        deque.push(1); // 스택의 맨 앞에 1 추가 deque[1]
        deque.push(2); // 큐의 맨 뒤에 2 추가 deque[1,2]
        deque.push(3); // 스택의 맨 앞에 3 추가 deque[3,1,2]
        System.out.println("deque = " + deque);

        // 다음 꺼낼 데이터 확인 (단순 조회)
        System.out.println("deque.peek() = " + deque.peek());

        // 데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque = " + deque);
    }
}
