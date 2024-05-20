package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {

    public static void main(String[] args) {

        String[][] productArr = {
                {"Java", "10000"},
                {"Spring", "20000"},
                {"JPA", "30000"}
        };

        Map<String, Integer> productmap = new HashMap<>();
        for (String[] product : productArr) {
            productmap.put(product[0], Integer.valueOf(product[1]));
        }

        for (String key : productmap.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + productmap.get(key));
        }

    }
}