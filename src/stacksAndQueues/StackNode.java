package stacksAndQueues;

public class StackNode<T> {
    public T data;
    public StackNode<T> next;

    public StackNode(T data){
        this.data = data;
    }
}
