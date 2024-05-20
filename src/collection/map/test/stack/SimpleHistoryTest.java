package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<String>();

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");
        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek());
        stack.pop();
        System.out.println("stack.peek() = " + stack.peek());
        stack.pop();
        System.out.println("stack.peek() = " + stack.peek());
        stack.pop();

        System.out.println("stack = " + stack);
    }
}
