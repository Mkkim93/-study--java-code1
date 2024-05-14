package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A"); // x001
        first.next = new Node(); // x002
        first.next.next = new Node("C"); // x003
        first.next.next.next = new Node("D"); // x004

        System.out.println("first = " + first);


        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            // first : 주소값
            System.out.println("x = " + x);
            System.out.println("x.item : " + x.item);
            System.out.println("x.next : " + x.next);
            x = x.next;
        }
    }
}
