package DSA.Tree_Binary;

import java.util.Scanner;
import DSA.Queue.QueueEmptyException;
import DSA.Queue.QueueUsingLL;
import java.util.*;
public class All_order_of_BT 
{
    public static void Inorder(BT_Node<Integer> root) 
    {
        if (root == null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void Preorder(BT_Node<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Postorder(BT_Node<Integer> root)
    {
        if(root == null)
        {
            return; 
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    public class Take_Input_LevelWise 
    {

        public static BT_Node<Integer> Take_Input_LevelWise() 
        {
            Scanner sc = new Scanner(System.in);
            QueueUsingLL<BT_Node<Integer>> pendingNodes = new QueueUsingLL<>();
            System.out.println("Enter the root data : ");
            int rootData = sc.nextInt();
            if (rootData == -1) 
            {
                return null;
            }
            BT_Node<Integer> root = new BT_Node<Integer>(rootData);
            pendingNodes.enqueue(root);
            while (!pendingNodes.isEmpty()) 
            {
                BT_Node<Integer> front;
                try 
                {
                    front = pendingNodes.dequeue();
                } catch (QueueEmptyException e) 
                {
                    // TODO: handle exception
                    return null;
                }
                // For entering the child of the root in the left childs ..
                System.out.println("Enter left child of " + front.data);
                int leftChild = sc.nextInt();
                if (leftChild != -1) 
                {
                    BT_Node<Integer> child = new BT_Node<Integer>(leftChild);
                    pendingNodes.enqueue(child);
                    front.left = child;
                }
                // for entering the value of the right child ....
                System.out.println("Enter right child of " + front.data);
                int rightChild = sc.nextInt();
                if (rightChild != -1) 
                {
                    BT_Node<Integer> child = new BT_Node<Integer>(rightChild);
                    pendingNodes.enqueue(child);
                    front.right = child;
                }
                // then reentering the while loop and check the tree is empty or not then
                // enter the child as same as till value is 0
            }
            return root;
        }

        public static void PrintTree(BT_Node<Integer> root)
        {
            // Your code goes here
            if (root == null) 
            {
                return;
            }
            LinkedList<BT_Node<Integer>> nodesToPrint = new LinkedList<BT_Node<Integer>>();
            nodesToPrint.add(root);
            while (!nodesToPrint.isEmpty()) 
            {
                BT_Node<Integer> front = nodesToPrint.poll();
                System.out.print(front.data + ":");
                if (front.left != null) 
                {
                    nodesToPrint.add(front.left);
                    System.out.print("L:" + front.left.data);
                } 
                else 
                {
                    System.out.print("L:-1");
                }
    
                if (front.right != null) 
                {
                    nodesToPrint.add(front.right);
                    System.out.print(",R:" + front.right.data);
                }
                else 
                {
                    System.out.print(",R:-1");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) 
        {
            BT_Node<Integer> root = Take_Input_LevelWise();
            // PrintTree(root);
            System.out.print("Inorder of the Binary Tree : ");
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
            System.out.println();

            System.out.print("Preorder of the Binary Tree : ");
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
            System.out.println();

            System.out.print("Postorder of the Binary Tree : ");
            Postorder(root.left);
            Postorder(root.right); 
            System.out.print(root.data + " ");
        }
    }
}

