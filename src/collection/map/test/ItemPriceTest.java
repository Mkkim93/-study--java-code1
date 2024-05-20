package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        System.out.println("map = " + map);

        List<String> list = new ArrayList<String>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) { // EntrySet() 으로 key + value 를 묶어준다.
            if (entry.getValue().equals(1000)) { // entry 에 있는 value 값을 1000원 일때
                list.add(entry.getKey()); // list 에 getKey() : 키 값을 넣어준다.
            }
        }

        System.out.println("list = " + list); // 최종적으로 list 는 value 가 1000 원인 key 값들을 가지게 된다.
    }
}
