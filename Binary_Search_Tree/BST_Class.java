package DSA.Binary_Search_Tree;

import DSA.Tree_Binary.BT_Node;

public class BST_Class {
    private BT_Node<Integer>  root;
    public void insertData(int data){

    }
    public void deleteData(int data){

    }
    private boolean hasDataHelper(int data , BT_Node<Integer> root){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        else if(data > root.data){
            // call right..
            return hasDataHelper(data, root.right);
                }
        else{
            // call left..
            return hasDataHelper(data, root.left); 
        }
    }
    public boolean hasData(int data){
       return hasDataHelper(data, root);
    }
    public static void main(String[] args) {
        
    }
}
