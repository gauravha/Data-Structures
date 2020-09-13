package LinkedList;


public class LinkedList<T> {

    public int size;
    public ListNode head;
    public LinkedList() {
        this.size = 0;
        this.head = null;

    }

    public LinkedList(ListNode firstNode, int size) {
        this.size = size;
        this.head = firstNode;

    }

    public int size() {
        return size;
    }


    public void add(T value){
        ListNode nodeToBeInserted = new ListNode(value);
        ListNode temp;
        temp = this.head;
        if(head == null){
            this.head = nodeToBeInserted;
            head.next = null;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
                size++;
            }
            nodeToBeInserted.next = null;
            temp.next = nodeToBeInserted;
        }
        size++;

    }

    int[] toArray(){
        ListNode temp = head;
        int[] output = new int[size];
        int i = 0;
        while (temp!=null){
            output[i] = (int) temp.val;
            temp = temp.next;
            i++;

        }
        return output;
    }



    public  void insertNode(ListNode headr, int valueInsert, int location){
        headr = this.head;
        ListNode temp = this.head;
        ListNode node = new ListNode(valueInsert);

        if(location <= size) {

            if (head == null) {
                this.head = node;
                head.next = null;
            } else if (location == 0) {
                node.next = headr;
                this.head = node;
            } else {
                for (int i = 0; i < location - 1; i++) {
                    temp = temp.next;
                }
                if (temp.next == null) {
                    node.next = null;
                    temp.next = node;
                } else {
                    node.next = temp.next;
                    temp.next = node;
                }
            }
            size++;
        }
        else{
            System.out.println("CHeck your bounds");
        }

    }

    public T get(T i) {
        return (T)head.val;
    }

    public T[] traversals(){
        T[] arrayReturn;
        arrayReturn = null;
        int i = 0;
        while(head != null){
            arrayReturn[i] = (T) head.val;
            i++;
        }
        return arrayReturn;
    }
}



