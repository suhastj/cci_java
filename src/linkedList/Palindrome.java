package linkedList;

public class Palindrome {
    public static void main(String[] args){
        SinglyLinkedListIntNode head = new SinglyLinkedListIntNode(1);

        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(SinglyLinkedListIntNode head){
        if(head.next == null)
            return true;

        while(head.next != null){
            SinglyLinkedListIntNode currentNode = head;
            while(currentNode.next.next != null){
                if(head.data == currentNode.next.data){
                    head = head.next;
                    currentNode.next = null;
                    break;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
