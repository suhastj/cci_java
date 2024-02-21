package treesAndGraphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RouteBetweenNodes {
    public static void main(String[] args){
        System.out.println(foundRoute(new Node("a"), new Node("b")));
    }

    private static boolean foundRoute(Node a, Node b){
        if(a == b){
            return true;
        }
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(a);
        visited.add(a);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current == b)
                return true;
            for(Node t : current.children){
                if(!visited.contains(t)){
                    visited.add(t);
                    queue.add(t);
                }
            }
        }
        
        return false;
    }
}
