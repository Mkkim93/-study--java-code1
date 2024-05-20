package collection.map.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTes2 {

    public static void main(String[] args) {

        // Map 에서 가격이 2000원 이상인 과일(key)을 출력
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("딸기", 5000);
        map.put("사과", 2000);
        map.put("바나나", 1000);
        map.put("배", 4000);
        map.put("포도", 4000);

        System.out.println("map = " + map);

        List<String> list = new ArrayList<String>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2000) {
                list.add(entry.getKey());
            }
        }
        System.out.println("list = " + list);
    }
}
