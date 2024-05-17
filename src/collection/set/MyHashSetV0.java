package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) { // contains (조회) 를 통해 value 가 true(값이 있다면) 동작 안함
            return false;
        }

        elementData[size] = value; // 위의 if 조건을 빠져나와 값이 없다면 새로운 값을 추가
        size++; // size 의 값 1 증가

        return true;
    }

    // O(n)
    public boolean contains(int value) {

        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
