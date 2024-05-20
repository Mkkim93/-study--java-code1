package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        // 자바에서 제공하는 Stack<>() 객체 선언
        Stack<Integer> stack = new Stack<Integer>();

        // 1. 스택을 push 를 통해 1->2->3 순서대로 넣는다.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        // 2. 다음 꺼낼 요소 확인 (.peak() : 실제 꺼내지 않고 단순 조회만 하는 메서드)
        System.out.println("stack.peek() = " + stack.peek());

        // 3. 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop()); // pop(3)
        System.out.println("stack.pop() = " + stack.pop()); // pop(2)
        System.out.println("stack.pop() = " + stack.pop()); // pop(1)
        System.out.println("stack = " + stack); // 모든 데이터를 꺼냈기 때문에 Stack 내에는 아무것도 없다.

    }
}
