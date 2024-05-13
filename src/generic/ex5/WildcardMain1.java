package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {

        Box<Object> objBox = new Box<Object>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.<Dog>printGenericV1(dogBox); // <Dog> 생략 가능
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("야옹이", 100));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
