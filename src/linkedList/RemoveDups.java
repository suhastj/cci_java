package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    public static void main(String[] args){
        RemoveDups removeDups = new RemoveDups();
        Node inClassNode = removeDups.new Node(); // example of it can be done with same class

        SinglyLinkedListIntNode node = new SinglyLinkedListIntNode(5);
        regular(node);
        // run regular or below method, cannot run both at same time
        // as duplicate nodes will already be removed from previous run
        // ifTempBufferNotAllowed(node);
        while(node != null){
            System.out.print("->" + node.data);
            node = node.next;
        }
    }

    private static void ifTempBufferNotAllowed(SinglyLinkedListIntNode node){
        SinglyLinkedListIntNode head = node;
        while(head.next != null){
            SinglyLinkedListIntNode currrentNode = head;
            while(currrentNode.next != null){
                if(head.data == currrentNode.next.data){
                    currrentNode.next = currrentNode.next.next;
                }
            }
            head = head.next;
        }
    }

    private static void regular(SinglyLinkedListIntNode node){
        Set<Integer> set = new HashSet<>();
        set.add(node.data);
        while(node.next != null){
            if(set.contains(node.next.data)){
                node.next = node.next.next;
            }
            else {
                set.add(node.next.data);
                node = node.next;
            }
        }
    }

    public class Node{

    }
}
