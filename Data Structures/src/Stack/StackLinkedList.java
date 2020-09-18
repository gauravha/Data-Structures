package Stack;

import LinkedList.LinkedList;
import LinkedList.ListNode;

public class StackLinkedList<T> {
    public LinkedList lister = new LinkedList();

    public StackLinkedList(){
        this.lister = new LinkedList();
    }

    public T peek(){
        return (T) lister.head.val;


    }
    public void push(T Value){
        ListNode temperory = new ListNode();
        temperory.val = Value;
        temperory.next = lister.head;
        lister.head = temperory;
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Error Message");
            return null;

        }
        else{
            ListNode tempo = lister.head;
            lister.head = lister.head.next;
            return (T) tempo.val;

        }

    }
    public boolean isEmpty(){
        if(lister.head ==null){
            return true;
        }
        else{
            return false;
        }

    }

    public void deleteStack(){
        lister.head = null;
    }



}
