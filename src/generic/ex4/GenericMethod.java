package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    // 제네릭 타입 메서드 선언 <T>
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print : " + t);
        return t;
    }

    // 제네릭 메서드 타입 제한 <T extend Number>
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Bound print : " + t);
        return t;
    }
}
