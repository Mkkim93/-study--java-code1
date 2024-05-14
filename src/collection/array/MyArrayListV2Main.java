package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {

        // V2 : 배열의 크기를 동적으로 증가 시키는 객체
        MyArrayListV2 list = new MyArrayListV2();

        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2,'z') = " + list.set(2, "z")); // data 를 변경
        System.out.println("list = " + list);

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println("list = " + list);
        list.add("e");
        System.out.println("list = " + list);

        // 범위 초과, 배열의 크기(capacity) 가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println("list = " + list);
    }
}
