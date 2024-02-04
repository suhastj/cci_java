package stacksAndQueues;

/*
 * Implement three stacks data structure using one array
 */
public class ThreeInOne {
    public static void main(String[] args){

    }

    public int[] currentStackSize;
    public int[] values;

    public ThreeInOne(int capacity){
        currentStackSize = new int[3];
        values = new int[3 * capacity];
    }

    private int currentStackIndex(int stackNumber){
        return (stackNumber-1)*(values.length/3)+currentStackSize[stackNumber-1]-1;
    }

    public boolean isEmpty(int stackNumber){
        return currentStackSize[stackNumber-1] == 0;
    }

    public void push(int stackNumber, int value){
        currentStackSize[stackNumber-1]++;
        values[currentStackIndex(stackNumber)] = value;
    }

    public int pop(int stackNumber) throws Exception{
        if(isEmpty(stackNumber)){
            throw new Exception("Stack is Empty");
        }
        int returnValue =  values[currentStackIndex(stackNumber)];
        currentStackSize[stackNumber-1]--;
        return returnValue;
    }

    public int peek(int stackNumber){
        return values[currentStackIndex(stackNumber)];
    }
}
