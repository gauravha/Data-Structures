package LinkedList;

public class ListNode<T> {
    public ListNode next;
    public T val;

    public ListNode() {}

    ListNode(T val) {
        this.val = val;
    }
    ListNode(T val, ListNode next) {
        this.val = val;
        this.next = next;
    }

//      int val;
//      ListNode next;
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}