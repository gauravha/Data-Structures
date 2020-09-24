package HeapBinary;

public class BinaryHeap<T> {
    T [] arr;
    int lastUsedIndex;
    public BinaryHeap(int size){
        arr = (T[]) new Object[size+1];
        lastUsedIndex = 0;
    }

    public void peekOfHeap(){
        if( !isEmpty()){
            System.out.println("Empty tree");
        }
        else{
            System.out.println (arr[1]);
        }
    }
    public int sizeOfHeap(){
        return (lastUsedIndex);

    }

    private boolean isEmpty() {
        if(lastUsedIndex == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
