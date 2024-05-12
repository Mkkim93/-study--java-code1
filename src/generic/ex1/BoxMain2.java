package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox(); // 코드 재사용성 높다. 타입 안정성이 떨어진다.
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer (다운) 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox(); // 코드 재사용성 높다. 타입 안정성이 떨어진다.
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String (다운) 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달 시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 예외 발생
        System.out.println("result = " + result);
    }
}
