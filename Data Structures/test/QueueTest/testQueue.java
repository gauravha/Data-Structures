package QueueTest;

import LinkedList.LinkedList;
import Queue.QueueLinearArray;
import Stack.StackArray;
import Stack.StackLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testQueue {
    private QueueLinearArray<Integer> queue1;
    private QueueLinearArray<Integer> queue2;

    @Before
    public void setUp(){

        queue1 = new QueueLinearArray<>(5);
        queue2 = new QueueLinearArray<>(3);
    }
    @Test
    public void initialQueue(){

        Assert.assertEquals(true, queue1.isEmpty());
    }

    @Test
    public void test_size_oneElement(){

        queue1.enqueue(4);
        queue1.enqueue(44);

        Assert.assertEquals(0, queue1.beginningOfQueue);
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
        Assert.assertEquals(0,queue2.beginningOfQueue);
        Assert.assertEquals(2,queue2.topOfQueue);



    }

    @Test
    public void peek_test(){
        queue2.enqueue(4);
        queue2.enqueue(43);
        queue2.dequeue();
        queue2.dequeue();
        Assert.assertEquals(0.0,queue2.peek());
    }

}
