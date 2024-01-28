package linkedList;

public class Partition {
    public static void main(String[] args){
        int x = 5;
        SinglyLinkedListIntNode node = new SinglyLinkedListIntNode(1);
        SinglyLinkedListIntNode lessThan = null;
        SinglyLinkedListIntNode greaterThanOrEqual = null;

        while(node != null){
            if(node.data < x){
                if(lessThan == null)
                    lessThan = node;
                else {
                    lessThan.next = node;
                    lessThan = lessThan.next;
                }
            }
            else {
                if(greaterThanOrEqual == null)
                    greaterThanOrEqual = node;
                else {
                    greaterThanOrEqual.next = node;
                    greaterThanOrEqual = greaterThanOrEqual.next;
                }
            }
            node = node.next;
        }
        lessThan.next = greaterThanOrEqual; 
    }
}
