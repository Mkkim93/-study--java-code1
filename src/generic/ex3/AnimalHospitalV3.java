package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {

        // <T> 가 Animal 를 상속 받았기 때문에 Animal 과 Animal 의 서브 클래스 기능들을 사용 할 수 있다.
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();

    }

    public T bigger(T target) {
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
