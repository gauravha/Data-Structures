package Queue;

public class QueueCircularArray<T> {

    public int sizeofQueue;
    public int startOfQueue;
    public T[] arrayForCircularQueue;
    public int topOfQueue;

    public QueueCircularArray(int sizee){
        this.sizeofQueue = sizee;
        this.arrayForCircularQueue = (T[]) new Object[sizee];
        this.startOfQueue = -1;
        this.topOfQueue = -1;

    }
}
