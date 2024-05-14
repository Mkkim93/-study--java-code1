package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {

        // V3 : 배열의 크기를 동적으로 증가 시키는 객체
        MyArrayListV3 list = new MyArrayListV3();

        // 마지막에 추가 0(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        // 원하는 위치에 추가
        System.out.println("addList");
        list.add(3, "addList"); // 0(1)
        System.out.println("list = " + list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // 0(n)
        System.out.println("list = " + list);

        // 데이터 삭제
        Object removed1 = list.remove(4);
        System.out.println("removed1(4) = " + removed1);
        System.out.println("list = " + list);

        Object removed2 = list.remove(0);
        System.out.println("removed2(0) = " + removed2);
        System.out.println("list = " + list);
    }
}
