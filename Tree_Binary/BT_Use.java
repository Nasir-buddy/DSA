package DSA.Tree_Binary;

public class BT_Use {
    public static void main(String[] args) {
        BT_Node<Integer> root = new BT_Node<>(1);
        BT_Node<Integer> node1 = new BT_Node<>(2);
        root.left = node1;
        BT_Node<Integer> node2 = new BT_Node<>(3);
        root.left = node2;

    }
}
