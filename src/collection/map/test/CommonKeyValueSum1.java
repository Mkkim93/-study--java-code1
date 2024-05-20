package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = Map.of("A", 1, "B",2, "C",3); // 아래 put 안해도됨
        // map1.put("A", 1);
        // map1.put("B", 2);
        // map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) { // map1 를 loop 를 돌려서 map2 와 키가 같은 것을 찾는다
            if (map2.containsKey(key)) { // 여기서 (key) 는 map1 의 키임
                result.put(key, map1.get(key) + map2.get(key)); // map1.get(key) 와 map2.get(key) 의 값을 더해서 key(맨앞에 있는 key)로 꺼낸다.
            }
        }
        System.out.println("result = " + result);
    }
}
