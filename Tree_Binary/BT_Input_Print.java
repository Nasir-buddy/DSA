package DSA.Tree_Binary;
import java.util.Scanner;

import DSA.Binary_Search_Tree.BST_insert;
public class BT_Input_Print {

        public static void printTree(BT_Node<Integer> root){
            if(root == null){
                return;
            }
            String toBEprinted = root.data + "";
            if(root.left != null){
                toBEprinted += "L:" + root.left.data + ",";
            }
            if(root.right != null){
                toBEprinted += "R:" + root.right.data + ",";
            }
            System.out.println(toBEprinted);
            printTree(root.left);
            printTree(root.right);
        } 
    public static BT_Node<Integer> takeInput(Scanner sc){
        int rootData;
        System.out.print("Enter the root data : "); 
        rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }
        BT_Node<Integer> root = new BT_Node<Integer>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BT_Node<Integer> root = takeInput(sc);
        // printTree(root);
        // sc.close();
        BST_insert bst = new BST_insert();
        bst.insertData(10);
        bst.insertData(20);
        bst.insertData(5);
        bst.insertData(15);
        bst.insertData(3);
        bst.insertData(7);
        bst.printTree();
        bst.deleteData(10);
        bst.printTree();

    }
}
