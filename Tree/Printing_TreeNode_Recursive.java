package DSA.Tree;

import java.util.Scanner;

public class Printing_TreeNode_Recursive {
    public static TreeNode<Integer> takeInput(Scanner sc){
        int n; 
        System.out.print("Enter the next Node data : ");
        // Entering the root data
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter the number of childern for " + n);
        //Enterign the child node of the root 
        int childCount = sc.nextInt();
        // we calling for every child node to insert the data...
        for(int i = 0; i < childCount; i++){
            TreeNode<Integer> child = takeInput(sc);
            root.childern.add(child);
        }
        return root;
    }
        //printing the all nood of the root..
    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i = 0; i < root.childern.size(); i++){
            s = s + root.childern.get(i).data + ",";
        }
        System.out.println(s);
        for(int i = 0; i < root.childern.size(); i++){
            print(root.childern.get(i));
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        print(root);
    }
}
