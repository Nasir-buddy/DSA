package DSA.Tree;
public class TreeUse {
    // Implementation of Tree node.
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        TreeNode<Integer> node4 = new TreeNode<Integer>(6);

        //Linking the all node to another.. 
        root.childern.add(node1);
        root.childern.add(node2);
        root.childern.add(node3);
        node2.childern.add(node4);

        System.out.println(root);
    }
}
