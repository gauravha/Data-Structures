package Queue;

import LinkedList.LinkedList;

public class QueueLinearLinkedList<T> {

    public LinkedList queueList = new LinkedList();

    public  QueueLinearLinkedList(){
        this.queueList = new LinkedList();

    }

    public void enqueue(T enqueueValue){
        queueList.insertNode(queueList.head, (T) enqueueValue,queueList.size);
    }
    public void dequeue(){
        queueList.deleteNode(queueList.head,0);

    }

    public boolean isEmpty() {
        if(queueList.head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public T get(int i) {
        if (queueList.head == null){
            System.out.println("Null head");
            return null;
        }
        else{
            return (T) queueList.head.val;

        }
    }
}
