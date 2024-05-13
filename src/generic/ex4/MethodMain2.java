package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 200);

        AnimalMethod.checkup(dog); // 실제로는 <Dog>.checkup 이 들어가는 것임 (타입 매개변수 추론)
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰멍멍이", 200);
        Dog biggerDog = AnimalMethod.bigger(dog, targetDog);
        System.out.println("biggerDog = " + biggerDog);

    }
}
