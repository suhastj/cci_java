package linkedList;

public class DeleteMiddleNode {
    public static void main(String[] args){
        SinglyLinkedListIntNode node = new SinglyLinkedListIntNode(1);
        SinglyLinkedListIntNode slow = node;
        SinglyLinkedListIntNode fast = node;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next.next;
    }
}
