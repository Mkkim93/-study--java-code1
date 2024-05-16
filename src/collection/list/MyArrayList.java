package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5; // 기본 배열의 크기 설정(5)

    private Object[] elementData; // object 배열 선언
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++; // 데이터를 넣을때마다 size 증가
    }

    @Override
    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        // 데이터 이동 코드 추가
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 코드 추가 : 요소의 마지막부터 index 까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    // 코드 추가
    @Override
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        // 데이터 이동
        size--;
        elementData[size] = null; // size 의 마지막 위치에 null 을 넣는다.
        return oldValue;
    }

    // 코드 추가 : 요소의 index 부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        // Arrays.copyOf : newCapacity 크기 만큼의 배열을 만들어 놓고 기존 데이터(elementData) 를 newArr 에 (복사 개념)넣는다.
        // 기존 배열 데이터(elementData) 는 GC 대상이다.
        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        elementData = newArr;
    }



    @Override   @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    // 배열의 특정 위치에 값 setting
    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 검색 기능
    @Override
    public int indexOf(E o) {
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
