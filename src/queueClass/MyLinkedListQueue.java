package queueClass;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    //Constructor khởi tạo queue (hàng đợi) với đầu và đuôi là trống
    //đầu và đuôi là các Node = {key, next} = lưu trữ dữ liệu và "nextLink" kế tiếp
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    //Thêm phần tử vào cuối của queue (hàng đợi)
    //Xét tính hợp lệ null của đầu và đuôi để xác lập dữ liệu nếu queue trống
    //nếu queue không trống thì ghi tiếp vào "nextLink" của đuôi hiện tại
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    //Xoá phần tử ở cuối đuôi của queue (hàng đợi)
    //Xét tính hợp lệ null của đầu và đuôi để xoá bỏ dữ liệu nếu queue trống
    //nếu queue không trống thì đuôi sẽ bị gán null để loại bỏ giá trị
    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    @Override
    public String toString() {
        return "MyLinkedListQueue{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
