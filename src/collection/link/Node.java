package collection.link;

public class Node {

    Object item;
    Node next;

    public Node() {
    }

    public Node(Object item) {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }


    // [A-> B-> C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; // 노드 x 에 자기 자신을 넣는다.
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
