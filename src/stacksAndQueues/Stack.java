package stacksAndQueues;

public class Stack<T> {
    public StackNode<T> top;

    public void push(T data){
        StackNode<T> stackNode = new StackNode<T>(data);
        stackNode.next = top;
        top = stackNode;

        // keep maintaining min at each Node level
        // assumption: T is int data type
        // can extend function and check data type, if String,
        // then compare appropriately
        if(stackNode.next == null){
            stackNode.min = data;
        }
        else {
            stackNode.min = ((int) data < (int)stackNode.next.data) ? data : stackNode.next.data;
        }
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

    public T min() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return top.min;
    }
}
