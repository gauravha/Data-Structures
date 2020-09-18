package LinkedList;

import java.util.Arrays;

public class Practice {
        static ListNode head1 = new ListNode(15, null);
        static LinkedList<Integer> list1 = new LinkedList(head1,1);

        public static void main(String[] args) {
//        list1.add(1);
//        list1.add(2);

//        list1.add(2);
            list1.insertNode(head1,13,0);
            list1.insertNode(head1,22,0);

            list1.insertNode(head1,4,1);
            list1.insertNode(head1,5,2);
            list1.insertNode(head1,6,3);
            list1.insertNode(head1,14,1);
            list1.insertNode(head1,142,5);
            list1.insertNode(head1,1142,7);
            list1.insertNode(head1,89,9);
            System.out.println(Arrays.toString(list1.toArray()));

            list1.deleteNode(head1,0);
            list1.deleteNode(head1,0);
            System.out.println(Arrays.toString(list1.toArray()));

            list1.deleteNode(head1,1);
//            list1.deleteNode(head1,);



//        list1.insertNode(head1,3,5);
            System.out.println(Arrays.toString(list1.toArray()));
            System.out.println(list1.size);
        }


}
