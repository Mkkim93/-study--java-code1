package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal; // 매개변수를 object 타입으로 선언 시

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object 기능만 사용한다. (toString(), hasCode() 등)
        animal.equals(null);
        animal.toString();
//        System.out.println("동물 이름 : " + animal.getName()); // getName() 메서드를 사용 할 수 없다. object 타입이기 때문
//        System.out.println("동물 크기 : " + animal.getSize()); // getSize() 메서드를 사용 할 수 없다. object 타입이기 때문
//        animal.sound();

    }

    public T bigger(T target) {
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
