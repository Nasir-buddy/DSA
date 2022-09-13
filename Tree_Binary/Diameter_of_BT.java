package DSA.Tree_Binary;

import java.util.Scanner;
import DSA.Queue.QueueEmptyException;
import DSA.Queue.QueueUsingLL;

public class Diameter_of_BT {
    public static int Diameter_of_BT(BT_Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int option1 = height(root.left) + height(root.right);
        int option2 = Diameter_of_BT(root.left);
        int option3 = Diameter_of_BT(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }

    public static int height(BT_Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }

    // taking input classs

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
                    // TODO: handle exception
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

        public static void main(String[] args) {
            BT_Node<Integer> root = Take_Input_LevelWise();
            System.out.println("Diameter : " + Diameter_of_BT(root));
        }
    }
}
