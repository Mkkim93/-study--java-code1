package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T t) {

        // <T> 가 Animal 를 상속 받았기 때문에 Animal 과 Animal 의 서브 클래스 기능들을 사용 할 수 있다.
        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getSize());
        t.sound();

    }

    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
