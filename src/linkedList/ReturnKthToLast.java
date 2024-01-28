package linkedList;

public class ReturnKthToLast {
    public static void main(String[] args){
        int k = 5;
        SinglyLinkedListIntNode node = new SinglyLinkedListIntNode(1);
        SinglyLinkedListIntNode head = node;
        int counter = 0;
        while(node != null){
            counter++;
            node = node.next;
        }
        int i = 0;
        node = head;
        while(i < counter - k - 1){
            i++;
            node = node.next;
        }
        System.out.println(node.data);
    }
}
