package StackTest;

import LinkedList.LinkedList;
import Stack.StackArray;
import Stack.StackLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testArrayStack {

    private StackArray<Integer> stack1;
    private StackLinkedList<Integer> stack2;

    @Before
    public void setUp(){

        stack1 = new StackArray<>(5);
        stack2 = new StackLinkedList<>();
    }
    @Test
    public void initialStackEmpty(){

        Assert.assertEquals(true, stack1.isEmpty());
    }

    @Test
    public void test_size_oneElement(){

        stack1.push(4);
        stack1.push(44);

        Assert.assertEquals(1, stack1.topOfStack);
    }
    @Test
    public void test_isEmpty(){

        stack1.push(4);
        stack1.push(44);
        stack1.pop();

        Assert.assertEquals(0, stack1.topOfStack);
    }


    @Test
    public void push_test(){
        stack2.push(5);
        stack2.push(55);
        stack2.pop();
        Assert.assertEquals((Integer) 5,(Integer)stack2.lister.size());
    }
}
