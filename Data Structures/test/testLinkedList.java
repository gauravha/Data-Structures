import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import LinkedList.LinkedList;
import LinkedList.ListNode;


public class testLinkedList {
    private LinkedList<Integer> list;
    @Before
    public void setUp(){

        list = new LinkedList<Integer>();
    }

    @Test
    public void initialListEmpty(){
        Assert.assertEquals(0,list.size());
    }

    @Test
    public void test_size_oneElement(){
        ListNode node = new ListNode();
        list.add(8);

        Assert.assertEquals(1,list.size());
    }


}
