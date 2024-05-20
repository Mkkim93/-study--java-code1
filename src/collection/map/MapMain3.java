package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        // System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 데이터 추가 1
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 추가 2
        studentMap.putIfAbsent("studentA", 100); // putIfAbsent() : 해당 메서드 내에 지정한 값이 있으면 데이터를 입력 하지 않는다 (100 이 있기 때문에 입력 안됨)
        studentMap.putIfAbsent("studentB", 100); // studentB 는 지정한 값 (100) 이 없기 때문에 메서드 수행

        System.out.println("studentMap = " + studentMap);
    }
}
