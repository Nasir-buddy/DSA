package DSA.Binary_Search_Tree;

import DSA.Tree_Binary.BT_Node;

public class BST_insert {
    private BT_Node<Integer> root;

    private BT_Node<Integer> insertData(int data, BT_Node<Integer> root) {
        if (root == null) {
            BT_Node<Integer> newNode = new BT_Node<Integer>(data);
            return newNode;
        }
        if (root.data > data) {
            root.left = insertData(data, root.left);
        } else {
            root.right = insertData(data, root.right);
        }
        return root;
    }

    public void insertData(int data) {
        root = insertData(data, root);
    }

    public void deleteData(int data) {
        root = deleteData(data, root);
    }

    private BT_Node<Integer> deleteData(int data, BT_Node<Integer> root) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteData(data, root.left);
            return root;
        } else if (data > root.data) {
            root.right = deleteData(data, root.right);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                BT_Node<Integer> minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteData(minNode.data , root.right);
                // return root;
            }
        }
        return root;
    }
    public void printTree(){
        printTree(root);
    }

    private static void printTree(BT_Node<Integer> root){
        if(root == null){
            return;
        }
        String toBEprinted = root.data + "";
        if(root.left != null){
            toBEprinted += "L:" + root.left.data + " ,";
        }
        if(root.right != null){
            toBEprinted += "R:" + root.right.data + " ,";
        }
        System.out.println(toBEprinted);
        printTree(root.left);
        printTree(root.right);
    } 
    public static void main(String[] args) {

    }
}
