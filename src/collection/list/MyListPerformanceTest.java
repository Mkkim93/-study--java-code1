package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {

        int size = 50000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size); // 앞에 추가 후 다음 데이터들을 한칸씩 다 밀어야 됨
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> myArrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        addLast(myArrayList, size);

        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(myArrayList, loop, 0);
        getIndex(myArrayList, loop, size / 2);
        getIndex(myArrayList, loop,  size - 1);

        System.out.println("==MyArrayList 검색=="); // 바로나오고
        search(myArrayList, loop, 0);
        search(myArrayList, loop, size / 2);
        search(myArrayList, loop,  size - 1);


        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(); // 조회용 데이터로 사용
        addLast(myLinkedList, size); // 찾는데 오래걸림

        System.out.println("==MyLinkedList 조회==");
        getIndex(myLinkedList, loop, 0);
        getIndex(myLinkedList, loop, size / 2);
        getIndex(myLinkedList, loop,  size - 1);

        System.out.println("==MyLinkedList 검색==");
        search(myLinkedList, loop, 0); // 바로나고
        search(myLinkedList, loop, size / 2); // 늦게
        search(myLinkedList, loop,  size - 1); // 늦게


    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index : " + index + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue : " + findValue + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
