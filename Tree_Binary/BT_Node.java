package DSA.Tree_Binary;

public class BT_Node<T> {
    public BT_Node(T data){
        this.data = data;
    }
    public T data;
    public  BT_Node<T> left;
    public  BT_Node<T> right;
}
