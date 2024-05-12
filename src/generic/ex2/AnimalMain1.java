package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Dog> dogbox = new Box<>();
        dogbox.set(dog);
        Dog findDog = dogbox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catbox = new Box<>();
        catbox.set(cat);
        Cat findCat = catbox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

    }
}
