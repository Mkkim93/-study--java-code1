package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {

        BatchProcessor arrayList = new BatchProcessor(new MyArrayList<>()); // x001
        BatchProcessor linkedList = new BatchProcessor(new MyLinkedList<>()); // x002

        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(list);


        arrayList.logic(50000); // 2253ms O(n)
        linkedList.logic(50000); // 15ms  O(1)

    }
}
