package DSA.Tree_Binary;
import java.util.*;
public class Tree_Pre_EndOrder {

    public static BT_Node<Integer> builtTree(int in[], int pre[]) {
        return builtTreeHelper(in, pre, 0, in.length - 1, 0, pre.length - 1);
    }

    public static BT_Node<Integer> builtTreeHelper( int in[] , int pre[] , int inS, int inE, int preS, int preE){
        if(inS > inE){
            return null;
        }
        int rootData = pre[preS];
        BT_Node<Integer> root = new BT_Node<Integer>(rootData);
        int rootInIndex = -1;
        for(int i = inS; i <= inE; i++){
            if(in[i] == rootData){
                rootInIndex = i; 
                break;
            }
        }
        if(rootInIndex == -1){
            return null;
        }
        int leftInS = inS;
        int leftInE = rootInIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;

        int rightInS = rootInIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;
        root.left = builtTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftInE);
        root.right = builtTreeHelper(in, pre, rightInS , rightInE , rightPreS, rightPreE);
        return root;
    }

    public static void PrintTree(BT_Node<Integer> root) {
        // Your code goes here
        if (root == null) {
            return;
        }
        LinkedList<BT_Node<Integer>> nodesToPrint = new LinkedList<BT_Node<Integer>>();
        nodesToPrint.add(root);
        while (!nodesToPrint.isEmpty()) {
            BT_Node<Integer> front = nodesToPrint.poll();
            System.out.print(front.data + ":");
            if (front.left != null) {
                nodesToPrint.add(front.left);
                System.out.print("L:" + front.left.data);
            } else {
                System.out.print("L:-1");
            }

            if (front.right != null) {
                nodesToPrint.add(front.right);
                System.out.print(",R:" + front.right.data);
            } else {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int in[] = {4 , 2 , 5 , 1, 3 ,7};
        int pre[] = {1, 2 , 4, 5 ,3, 7}; 
        BT_Node<Integer> root = builtTree(in, pre);
        PrintTree(root);
    }
}
