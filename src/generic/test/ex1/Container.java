package generic.test.ex1;

public class Container<T> {

    private T value;

    public T getItem() {
        return value;
    }

    public void setItem(T value) {
        this.value = value;
    }

    boolean isEmpty() {

        // return value == null; false

        if (this.value == null) {
            return false;
        } else
            return true;
    }
}
