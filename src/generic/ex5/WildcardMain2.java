package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {

        Box<Object> objBox = new Box<Object>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        // writeBox(dogBox); // 컴파일 오류 Dog < Animal
        // writeBox(catBox); // 컴파일 오류 Cat < Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);

    }

    // <? 가 Animal 보다 같거나 위에 있어야 호출 가능>
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
