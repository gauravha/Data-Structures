package Stack;

public class StackArray<T> {

    public int size;
    public int topOfStack;
    public T[] arrayForStack;

    public StackArray(int sizer){
        this.size = sizer;
        this.topOfStack = -1;
        this.arrayForStack = (T[]) new Object[sizer];

    }

    public void push(T value){

        if (isFull()){
            System.out.println("Stack is Full");

        }
        else{
            topOfStack++;
            arrayForStack[topOfStack] = value;
        }

    }

    public void pop(){
        if(isEmpty()){
            System.out.println("ERROR Stack is EmPTY");
        }
        else{
            System.out.println(arrayForStack[topOfStack]);
            topOfStack--;
        }
    }
    public void peek(){
        if(isEmpty() == true){
            System.out.println("ERROR Stack is EmPTY");
        }
        else{
            System.out.println(arrayForStack[topOfStack]);
        }
    }

    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfStack == size){
            return true;
        }
        else{
            return false;
        }
    }

    public void deleteStack(){
        arrayForStack = null;
    }

}
