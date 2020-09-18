package QueueTest;

import LinkedList.LinkedList;
import Queue.QueueLinearArray;
import Queue.QueueLinearLinkedList;
import Stack.StackArray;
import Stack.StackLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class testQueue {
    private QueueLinearLinkedList<Integer> queue1;
    private QueueLinearLinkedList<Integer> queue2;

    @Before
    public void setUp(){

        queue1 = new QueueLinearLinkedList();
        queue2 = new QueueLinearLinkedList();
    }
    @Test
    public void initialQueue(){

        Assert.assertEquals(true, queue1.isEmpty());
    }

    @Test
    public void test_size_oneElement(){

        queue1.enqueue(4);
        queue1.enqueue(44);

        Assert.assertEquals(0, queue1);
    }
    @Test
    public void test_isEmpty(){

        queue1.enqueue(4);
        queue1.dequeue();
        queue1.enqueue(44);
        queue1.dequeue();


        Assert.assertEquals(true,queue2.isEmpty());


    }


    @Test
    public void enqueue_test(){
        queue2.enqueue(5);
        queue2.enqueue(55);
        queue2.enqueue(34);



    }

    @Test
    public void peek_test(){
        queue2.enqueue(4);
        queue2.enqueue(43);
        queue2.enqueue(2);
        queue2.dequeue();
        queue2.dequeue();

        queue2.enqueue(34);
        queue2.enqueue(4);
        queue2.enqueue(9);
        queue2.dequeue();
        int outp[] = {34,4,9} ;

        Assert.assertEquals(Arrays.toString(outp),Arrays.toString(queue2.queueList.traversals()));

    }


}
