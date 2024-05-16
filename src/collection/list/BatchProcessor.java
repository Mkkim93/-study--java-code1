package collection.list;
/**
 * 핵심 : 의존성 주입을 통해 BatchProcessor 는 MyArrayList 와 MyLinkedList 에 직접적으로 의존하지 않는다 (컴파일 시점에 의존관계)
 * MyList 를 통해 두 객체를 사용할 수 있다.
 */

public class BatchProcessor {

    private final MyList<Integer> list; // 핵심 : 인터페이스를 먼저 구현하면 그 하위에 있는 기능을 사용하고 생성할 수 있다.

    // MyList = MyArrayList
    // MyList = MyLinkedList
    // logic 의 기능을 외부에서 수행 할 떄 list 는 MyArrayList 도 될수 있고 MyLinkedList 도 될 수 있다.
    public BatchProcessor(MyList<Integer> list) { // 생성자 의존관계 주입법
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
