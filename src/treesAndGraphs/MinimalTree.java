package treesAndGraphs;

public class MinimalTree {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4};
        IntegerNode root = constructMinimalTree(arr, 0, arr.length-1);
        System.out.println("root of the tree: " + root.data);
    }

    private static IntegerNode constructMinimalTree(int[] arr, int min, int max){
        if(max < min)
            return null;
        int mid = (min + max)/2;
        IntegerNode node = new IntegerNode(arr[mid]);
        node.left = constructMinimalTree(arr, min, mid-1);
        node.right = constructMinimalTree(arr, mid+1, max);
        return node;
    }
}
