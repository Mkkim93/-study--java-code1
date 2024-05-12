package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {

        IntegerBox integerBox = new IntegerBox(); // 타입 안정성이 높다. 코드 오류, 재사용성은 떨어진다.
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox(); // 타입 안정성이 높다. 코드 오류, 재사용성은 떨어진다.
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
