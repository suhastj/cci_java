package linkedList;

import java.util.HashMap;
import java.util.Map;

public class Intersection {
    public static void main(String[] args){
        SinglyLinkedListIntNode list1 = new SinglyLinkedListIntNode(1);
        SinglyLinkedListIntNode list2 = new SinglyLinkedListIntNode(1);
        SinglyLinkedListIntNode connectingNode = new SinglyLinkedListIntNode(2);
        list1.next = connectingNode;
        list2.next = connectingNode;
        System.out.println(regular_usingHashMap(list1, list2));
        System.out.println(withoutAdditionalDataStructure(list1, list2));
    }

    private static Integer withoutAdditionalDataStructure(SinglyLinkedListIntNode list1, 
            SinglyLinkedListIntNode list2){
        int counter1 = 0;
        int counter2 = 0;
        SinglyLinkedListIntNode tempNode1 = list1;
        SinglyLinkedListIntNode tempNode2 = list2;

        while(tempNode1.next != null){
            counter1++;
            tempNode1 = tempNode1.next;
        }

        while(tempNode2.next != null){
            counter2++;
            tempNode2 = tempNode2.next;
        }

        if(tempNode1 == tempNode2){
            System.out.println("Intersecting");
        }
        else {
            System.out.println("Not Intersecting");
        }

        int startingPoint = Math.abs(counter1 - counter2);
        while(startingPoint != 0){
            list1 = list1.next;
            list2 = list2.next;
            startingPoint--;
        }

        while(list1 != list2){
            list1 = list1.next;
            list2 = list2.next;
        }

        if(list1 == list2)
            return list1.data;

        return null;
    }

    private static Integer regular_usingHashMap(SinglyLinkedListIntNode list1, SinglyLinkedListIntNode list2){
        Map<SinglyLinkedListIntNode, Boolean> list1Map = new HashMap<>();
        SinglyLinkedListIntNode tempNode1 = list1;
        while(tempNode1 != null){
            list1Map.put(tempNode1, null);
            tempNode1 = tempNode1.next;
        }

        SinglyLinkedListIntNode tempNode2 = list2;
        while(tempNode2 != null){
            if(list1Map.containsKey(tempNode2)){
                return tempNode2.data;
            }
            tempNode2 = tempNode2.next;
        }

        return null;
    }
}
