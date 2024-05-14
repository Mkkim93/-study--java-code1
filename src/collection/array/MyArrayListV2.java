package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5; // 기본 배열의 크기 설정(5)

    private Object[] elementData; // object 배열 선언
    private int size = 0; // 데이터를 넣을때마다 size 증가

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        // Arrays.copyOf : newCapacity 크기 만큼의 배열을 만들어 놓고 기존 데이터(elementData) 를 newArr 에 (복사 개념)넣는다.
        // 기존 배열 데이터(elementData) 는 GC 대상이다.
        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        elementData = newArr;
    }

    public Object get(int index) {
        return elementData[index];
    }

    // 배열의 특정 위치에 값 setting
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 검색 기능
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        // [1,2,3,null,null] -> size = 3
        // [1,2,3] -> size = 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) // .copyOf : null 값 제거 (배열에서 size 크기(3)만 출력 한다).
                + "size = " + size + ", capacity = " + elementData.length;
    }
}
