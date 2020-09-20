package BInaryTree;

public class BInaryTreeArray<T>{
    T [] arr;
    int lastUsedIndex;
    public BInaryTreeArray(int size){
        arr = (T[]) new Object[size+1];
        lastUsedIndex = 0;
    }
    public void insertNode(T value){
//        BInaryTreeArray<T> bInaryTreeArray = null;
        if (!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
        }
        else{
            System.out.println("Cannot insert this value because array is full");
        }
    }

    private boolean isFull() {
        if (arr.length-1 == lastUsedIndex){
            return true;
        }
        else {
            return false;
        }
    }

    public void search(T valuee){
        for(int k = 1;k<=lastUsedIndex;k++){
            if(arr[k] == valuee){
                System.out.println("FOund it");
            }

            else{
                System.out.println("Couldn't find it");

            }
        }
    }

    public void inOrderTraversals(int index){
        if(index>lastUsedIndex){
            return;
        }
        else{
            inOrderTraversals(index*2);
            System.out.println(arr[index]);
            inOrderTraversals(index*2+1);
        }

    }
    public void levelOrderTraversals(){
        for(int i = 1; i<=lastUsedIndex;i++){
            System.out.println(arr[i]);
        }

    }


    public void preOrderTraversals(int index){
        if(index>lastUsedIndex){
            return;
        }
        else{
            System.out.println(arr[index]);

            preOrderTraversals(index*2);
            preOrderTraversals(index*2+1);
        }

    }
    public void postOrderTraversals(int index){
        if(index>lastUsedIndex){
            return;
        }
        else{
            postOrderTraversals(index*2);
            postOrderTraversals(index*2+1);
            System.out.println(arr[index]);

        }

    }

    public static void main(String[] args) {
        BInaryTreeArray bInaryTreeArray = new BInaryTreeArray(10);
        bInaryTreeArray.insertNode(5);
        bInaryTreeArray.insertNode(15);
        bInaryTreeArray.insertNode(35);
        bInaryTreeArray.insertNode(45);
        bInaryTreeArray.insertNode(55);

        bInaryTreeArray.inOrderTraversals(1);
        bInaryTreeArray.postOrderTraversals(1);
        bInaryTreeArray.preOrderTraversals(1);
        bInaryTreeArray.levelOrderTraversals();

    }

}
