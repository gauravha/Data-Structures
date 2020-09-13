package LinkedList;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProblems {

    ListNode node = new ListNode(4,null);
    public static int getDecimalValue(ListNode head) {
        int decimalVal = 0;
        int power = 0;
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
            power++;
        }
        curr = head;
        while(curr != null) {
            int something = (Integer) curr.val;
            decimalVal += (int) (something * Math.pow(2, power--));
            curr = curr.next;
        }
        return decimalVal;
    }
    //Solved
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        else{
            ListNode header = new ListNode(head.val,null);
            head = head.next;
            while(head != null){
                int valer = (int) head.val;
                ListNode temp = new ListNode(valer,header);
                header = temp;
                head = head.next;
            }
            return header;
        }

    }
    //Notsolved
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null){
            return null;
        }


        else{
            int counter = 1;

            ListNode temperonary_header = head;

            while(counter<m){
//                ListNode make_node = new ListNode(head.val,null);
                temperonary_header = temperonary_header.next;
                counter++;
            }
            counter++;
            ListNode header = new ListNode(temperonary_header.next.val,null);

            if(counter == m){
                while(counter <= n){
                    int valer = (int) head.val;
                    ListNode temp = new ListNode(valer,header);
                    header = temp;
                    temperonary_header = temperonary_header.next;
                    counter++;
                }
            }
            while(temperonary_header!= null){

            }

            return head;
        }
    }
    //NOt solved

    public static int palindrome(int[] Aaaaray){
        int bool = 0;
        int half = (int) Math.floor(Aaaaray.length/2);
        if(Aaaaray.length ==1 ){
            return 1;
        }
        for(int i = 0; i<half;i++){
            if(Aaaaray[i] == Aaaaray[Aaaaray.length-1-i]){
                bool = 1;
            }
            else{
                bool = 0;
                return bool;
            }
        }
        return bool;
    }
    public int lPalin(ListNode A) {
        String integers = "";
        while(A !=null){
            int val = (int) A.val;
            integers+= Integer.toString(val);
            A = A.next;
        }
        String[] array = integers.split("");
        int[] arra = new int[array.length];
        for(int k = 0;k<array.length;k++){
            arra[k] = Integer.parseInt(array[k]);
        }
        return (palindrome(arra));


    }



    public static void main(String[] args) {
        LinkedList<Integer> forexample = new LinkedList<>();
        forexample.add(0);
        forexample.add(1);
        forexample.add(0);
        forexample.add(1);
        forexample.add(0);
        forexample.add(1);
        forexample.add(0);
        forexample.add(1);


        int atfk[] = new int[]{1};
        System.out.println(palindrome(atfk));

    }
}
