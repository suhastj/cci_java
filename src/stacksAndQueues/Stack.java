package stacksAndQueues;

public class Stack<T> {
    public StackNode<T> top;

    public void push(T data){
        StackNode<T> stackNode = new StackNode<T>(data);
        stackNode.next = top;
        top = stackNode;
    }

    public T pop() throws Exception{
        if(top == null){
            throw new Exception("Stack is Empty");
        }
        T returnData = top.data;
        top = top.next;
        return returnData;
    }

    public T peek() throws Exception{
        if(top == null){
            throw new Exception("Stack is Empty");
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
