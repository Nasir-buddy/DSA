package DSA.Tree_Binary;
import java.util.LinkedList;
import java.util.Scanner;
import DSA.Queue.QueueEmptyException;
import DSA.Queue.QueueUsingLL;

public class Take_Input_LevelWise {

    public static BT_Node<Integer> Take_Input_LevelWise() {
        Scanner sc = new Scanner(System.in);
        QueueUsingLL<BT_Node<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter the root data : ");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BT_Node<Integer> root = new BT_Node<Integer>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            BT_Node<Integer> front;
            try {
                front = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            // For entering the child of the root in the left childs ..
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BT_Node<Integer> child = new BT_Node<Integer>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }
            // for entering the value of the right child ....
            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BT_Node<Integer> child = new BT_Node<Integer>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
            // then reentering the while loop and check the tree is empty or not then
            // enter the child as same as till value is 0
        }
        return root;
    }
    // Recusive function for printing ....
    // public static void printTree(BT_Node<Integer> root) {
    // if (root == null) {
    // return;
    // }
    // String toBEprinted = root.data + "";
    // if (root.left != null) {
    // toBEprinted += "L:" + root.left.data + " ,";
    // }
    // if (root.right != null) {
    // toBEprinted += "R:" + root.right.data + " ,";
    // }
    // System.out.println(toBEprinted);
    // printTree(root.left);
    // printTree(root.right);
    // }

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
            BT_Node<Integer> root = Take_Input_LevelWise();
            PrintTree(root);
        }
    }
