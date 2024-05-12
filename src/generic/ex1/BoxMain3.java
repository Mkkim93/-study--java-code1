package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>(); // Integer : 타입 인자
        integerBox.set(10);
        // integerBox.set("문자1"); // Integer 타입만 허용
        Integer integer = integerBox.get(); // Integer 타입 반환 (캐스팅 안됨)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("문자100");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double double1 = doubleBox.get();
        System.out.println("double1 = " + double1);

        // 타입 추론(jdk) : 생성하는 위치에 제네릭 타입 생략 가능 (생략하면 안되는 상황도 있다!! 규칙 존재)
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
