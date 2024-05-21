package collection.iterable;

import java.util.Iterator;

// 배열을 반복하는 반복자 생성
public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() { // 즉 hasNext() 는 다음 배열에 인덱스가 존재하는지 확인하는 기능
        return currentIndex < targetArr.length - 1; // 현재 배열(currentIndex) 이 인덱스보다 작으면 반환
    }

    @Override
    public Integer next() { // next()는 hasNext() 에서 다음 배열에 인덱스가 존재하면 다음 배열로 한칸 이동한다.
        return targetArr[++currentIndex];
    }
}
