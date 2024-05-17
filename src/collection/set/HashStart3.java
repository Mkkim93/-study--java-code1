package collection.set;

import java.util.Arrays;
import java.util.HashSet;

public class HashStart3 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; // 배열의 인덱스로 값을 찾기 떄문에 O(1) 이다.
        System.out.println("result = " + result); // 그러나, 배열의 나머지 공간이 null 이 되기때문에 공간(메모리) 낭비가 발생 한다.


    }
}
