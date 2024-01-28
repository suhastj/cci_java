package linkedList;

public class SumLists {
    private static int remainder = 0;
    private static SinglyLinkedListIntNode head = null;
    public static void main(String[] args){
        SinglyLinkedListIntNode list1 = new SinglyLinkedListIntNode(1);
        SinglyLinkedListIntNode list2 = new SinglyLinkedListIntNode(2);
        SinglyLinkedListIntNode result = null;

        while(list1 != null && list2 != null){
            result = compute(result, list1.data, list2.data);
            list1 = list1.next;
            list2 = list2.next;
        }

        while(list1 != null){
            result = compute(result, list1.data, 0);
            list1 = list1.next;
        }

        while(list2 != null){
            result = compute(result, 0, list2.data);
            list2 = list2.next;
        }
        
        // iterate over 'head' to verify result
        while(head != null){
            System.out.print("->" + head.data);
            head = head.next;
        }
    }

    private static SinglyLinkedListIntNode compute(SinglyLinkedListIntNode result, int a, int b){
        int sum = remainder + a + b;
        if(sum >= 10){
            remainder = 1;
            sum = sum % 10 ;
        }
        else {
            remainder = 0;
        }
        if(result == null){
            result = new SinglyLinkedListIntNode(sum);
            head = result;
        }
        else {
            result.next = new SinglyLinkedListIntNode(sum);
            result = result.next;
        }
        return result;
    }
}
