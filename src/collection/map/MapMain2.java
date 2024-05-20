package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println("studentMap = " + studentMap);

        studentMap.put("studentA", 100); // 같이 키에 다른 값 저장 시 기존값 교체
        System.out.println("studentMap = " + studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        Integer remove = studentMap.remove("studentA");
        System.out.println("remove = " + remove);
        System.out.println("studentMap = " + studentMap);
    }
}
