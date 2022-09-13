package DSA.Tree;
import java.util.ArrayList;
public class TreeNode<T>{
        public T data;
        public ArrayList<TreeNode<T>> childern;

        public TreeNode(T data){
            this.data = data;
            childern = new ArrayList<>();
        }
    }