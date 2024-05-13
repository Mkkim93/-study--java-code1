package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {

        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i); // 메서드 호출 시점에, Integer 타입으로 변경해서 i 출력
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i); // <Integer, Double> 생략 가능 : java 컴파일러의 타입 추론
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
