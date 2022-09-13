package DSA.Tree;

public class Depth_of_tree {
    public static void printAtK(TreeNode<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for(int i = 0; i < root.childern.size(); i++){
            printAtK(root.childern.get(i) , k - 1);
        }
    }

    public static void main(String[] args) {

    }
}
