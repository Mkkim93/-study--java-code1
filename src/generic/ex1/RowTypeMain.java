package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {

        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        Object result = integerBox.get();
        System.out.println("result = " + result);
    }
}
