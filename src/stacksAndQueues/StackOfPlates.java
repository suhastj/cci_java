package stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class StackOfPlates<T> {
    public static void main(String[] args){

    }

    private List<Stack<T>> setOfStacks;
    private int currentStack = 0;
    private int maxNodesInStack = 10;

    public StackOfPlates(){
        setOfStacks = new ArrayList<>();
        setOfStacks.add(new Stack<>());
    }

    public void push(T data){
        if(setOfStacks.get(currentStack).count == maxNodesInStack){
            setOfStacks.add(new Stack<>());
            currentStack++;
        }
        setOfStacks.get(currentStack).push(data);
    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        T returnValue = setOfStacks.get(currentStack).pop();
        if(setOfStacks.get(currentStack).count == 0 && currentStack > 0){
            currentStack--;
        }
        return returnValue;
    }

    public T popAt(int index) throws Exception{
        if(setOfStacks.get(index).isEmpty()){
            throw new Exception("Stack at index " + index + " is empty.");
        }
        return setOfStacks.get(index).pop();
    }

    public T peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return setOfStacks.get(currentStack).peek();
    }

    public boolean isEmpty(){
        return setOfStacks.get(0).count == 0;
    }
}
