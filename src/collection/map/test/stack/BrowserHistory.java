package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> history = new ArrayDeque<>();
    private String currentPage = null; // 현재 페이지 생성

    // 현재 페이지가 null 이 아니면 즉, 현재 페이지가 있으면 history 에 넣어준다 push()
    public void visitPage(String url) {
        if (currentPage != null) {
        history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문 : " + url);
    }

    // 만약 history 가 비어 있지 않으면 즉, 이전 페이지가 있으면 해당 페이지를 꺼낸다. (그렇게 되면 이전전페이지가 뜬다)
    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기 : " + currentPage);
            return currentPage;
        }
        return null;
    }
}