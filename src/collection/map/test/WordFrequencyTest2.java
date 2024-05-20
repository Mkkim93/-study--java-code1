package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" "); // 문자열을 잘라서 words 라는 문자열 배열로 변환

        for (String word : words) {
            /* OrDefault() 로 간결하게 코드를 줄일 수 있다 아래 참조
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
*/
            // getOrDefault() : word(orange) 를 넣었는데 없으면 0 을 반환
            Integer count = map.getOrDefault(word, 0);
            map.put(word, count+1);
        }
        System.out.println("texts = " + map);
    }
}
