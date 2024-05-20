package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력 하세요 (종료는 'q') : ");
            String english = sc.nextLine();

            if (english.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            String korean = sc.nextLine();
            dictionary.put(english, korean);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String english = sc.nextLine();
            if (english.equals("q")) {
                break;
            } else if (!dictionary.containsKey(english)) {
                System.out.print(english + "은(는) 사전에 없는 단어 입니다.");
                break;
            } else {
                String searchWord = dictionary.get(english);
                System.out.println(english + " 의 뜻: " + searchWord);
            }
        }
    }
}