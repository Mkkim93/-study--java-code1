package collection.link;
// 제네릭 도입 <>
public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (first == null) {
            first = newNode; // 새로운 노드를 first 에 넣는다.
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++; // 범위를 초과해도 size 를 초과한 인덱스만큼 증가 시키기 때문에 예외가 발생하지 않는다.
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 첫번쨰 위치에 데이터 추가 코드 (newNode : 나의 노드)
    public void add(int index, E e) {
        Node<E> newNode = new Node(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1); // 직전 노드 탐색
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 추가 코드 : 첫번째 위치의 데이터 삭제
    public E remove(int index) {
        Node<E> removeNode = getNode(index); // 삭제할 위치를 찾는다
        E removeItem = removeNode.item; // 삭제할 아이템 꺼낸다
        if (index == 0) {
            first = removeNode.next; // removeNode 가 첫번째 노드가된다.
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 검색
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) { // 반복 횟수 : x가 next 가 아닐떄 까지 반복
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedV2 {" +
                "first : " + first +
                ", size : " + size +
                '}';
    }

    // 중첩 클래스로 제네릭 도입
    private static class Node<E> {

        E item;
        Node<E> next;

        public Node() {
        }

        public Node(E item) {
            this.item = item;
        }

        // [A-> B-> C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node <E> x = this;
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
}
