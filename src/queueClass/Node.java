package queueClass;

public class Node {
    public int key;
    public Node next;

    //Constructor Node = {key, next} = lưu trữ dữ liệu và "nextLink" kế tiếp
    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}
