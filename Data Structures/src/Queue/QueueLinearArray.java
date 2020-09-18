package Queue;

public class QueueLinearArray<T>{

    public int sizeofQueue;
    public int topOfQueue;
    public T[] arrayForQueue;
    public int beginningOfQueue;

    public QueueLinearArray(int sizer){
        this.sizeofQueue = sizer;
        this.topOfQueue = -1;
        this.arrayForQueue = (T[]) new Object[sizer];
        this.beginningOfQueue = -1;

    }

    public void enqueue(T valuee){
        if(isFull()){
            System.out.println("Queue is Full ");
        }
        else{
            if(beginningOfQueue == -1){
                beginningOfQueue = 0;
            }
            arrayForQueue[topOfQueue+1]=valuee;
            topOfQueue++;

        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Popped Value is "+arrayForQueue[beginningOfQueue]);
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue =-1;
                topOfQueue = -1;
            }

        }

    }

    public double peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        else{

            System.out.println("value is "+arrayForQueue[beginningOfQueue]);
        }
        return 0;
    }

    public boolean isEmpty() {
        if(topOfQueue == -1 && beginningOfQueue == -1){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isFull() {
        if(sizeofQueue == topOfQueue+1){
            return true ;
        }
        else{
            return false;
        }
    }

    public void deleteQueue(){

        arrayForQueue = null;
    }



}
