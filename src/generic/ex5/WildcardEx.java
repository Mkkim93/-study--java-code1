package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드카드 메서드 생성 <?> : 어떤 것도 다 들어올 수 있다는 뜻 (Bob<Dog>, Box<Cat>, Box<Object>)
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

     // 1. 제네릭타입 메서드 생성
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 2. 와일드카드 메서드 생성 <? extends Animal> 제한
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
