package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {

        // Map < key : String, value : Integer >
        Map<String, Integer> students = new HashMap<String, Integer>();

        // 학생 성적 데이터 추가
        students.put("studentA", 90);
        students.put("studentB", 80);
        students.put("studentC", 80);
        students.put("studentD", 70);
        students.put("studentE", 100);
        System.out.println("students = " + students);

        // 특정 학생의 값 조회
        Integer result = students.get("studentD");
        System.out.println("studentD = " + result);

        System.out.println("==keySet 활용==");
        Set<String> keySet = students.keySet(); // Set 자료 구조로 반환
        for (String key : keySet) { // keySet() : key 값만 꺼낼 수 있다.
            Integer value = students.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("==entrySet 활용=="); // Entry : key 와 value 를 저장하는 객체
        Set<Map.Entry<String, Integer>> entries = students.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("==values 활용==");
        Collection<Integer> values = students.values(); // map 에서 값만 반환 (컬렉션)
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

    }
}
