package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("first = " + first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색 하기");
        printAll(first);
        System.out.println();
        System.out.println();

        // 마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);
        System.out.println();


        // 특정 index 노드 조회하기
        System.out.println("노드 조회하기");
        int index = 0;
        Node indexNode = getNode(first, index);
        System.out.println("indexNode = " + indexNode);
        System.out.println();

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
        System.out.println();

        System.out.println("마지막 노드 조회하기");
        System.out.println("lastNode = " + lastNode);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.print(x.item);
            x = x.next; // 다음 노드를 지정
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next; // 다음 노드를 지정
        }
        return x; // x.next == null
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 마지막 노드에 새 노드 추가
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param); // 마지막 노드에 새 노드 추가
    }
}
