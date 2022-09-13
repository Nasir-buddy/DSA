package DSA.Binary_Search_Tree;
import DSA.Tree_Binary.BT_Node;
import DSA.Tree_Binary.pair;
public class Check_BST_1 {
    
    public static boolean isBST(BT_Node<Integer> root){
        if(root == null ){
            return true;
        }
        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right); 
        if(root.data <= leftMax){
            return false;
        }
        if(root.data > rightMin){
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        if(isLeftBST && isRightBST){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int minimum(BT_Node<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static int maximum(BT_Node<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
    // Is BST optimized code .. 
    // O(n)
    public static pair<Boolean, pair<Integer , Integer>> isBST2(BT_Node<Integer> root){
        if(root == null){
            pair<Boolean, pair<Integer , Integer>> output = new pair<Boolean , pair<Integer , Integer>>();
            output.first = true; 
            output.second = new pair<Integer , Integer>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        pair<Boolean , pair<Integer , Integer>> leftOutput = isBST2(root.left);
        pair<Boolean , pair<Integer , Integer>> rightOutput = isBST2(root.right);
        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
        boolean isBST = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first)
        && (leftOutput.first && rightOutput.first);
        pair<Boolean, pair<Integer , Integer>> output = new pair<Boolean , pair<Integer , Integer>>();
        output.first = isBST; 
        output.second = new pair<Integer , Integer>();
        output.second.first = min;
        output.second.first = max;
        return output;
    }
   // Is BST shot code + same complexity .......  
   // O(n)........
        public static boolean isBST3(BT_Node<Integer> root , int min , int max){
            if(root == null){
                return true;
            }
            if(root.data < min || root.data > max){
                return false;
            }
            boolean isLeftOk = isBST3(root.left, min , root.data - 1);
            boolean isRightOK = isBST3(root.right , root.data , max);
            return isLeftOk && isRightOK;
        }
    
    public static void main(String[] args) {
        
    }
}
