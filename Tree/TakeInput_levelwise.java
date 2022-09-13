package DSA.Tree;

import java.util.Scanner;
import DSA.Queue.QueueEmptyException;
import DSA.Queue.QueueUsingLL;

public class TakeInput_levelwise {

    public static TreeNode<Integer> takeInputleverwiss() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root data : ");
        // entring the root data
        int rootdata = sc.nextInt();
        // using queue for tree . giving data and Integer tree node in queue
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        // making tree node using rootdata.
        TreeNode<Integer> root = new TreeNode<Integer>(rootdata);
        pendingNodes.enqueue(root);
        // Its for the traversing on each element of the queue (pending nodes).
        // jab tk khali na ho jay enter krte rehna hai ...😂😂😂 ...
        while (!pendingNodes.isEmpty()) {
            // handling the queue empty exception by try catch because we dequeue
            try {
                // queue se front node nikal ke uske childern puchna hai ..
                // like 1 root bahar aake uske childern puchenge
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter the num of childern of " + frontNode.data);
                int numChild = sc.nextInt();
                // jitne bhi childern hai utna bar input lena hai ..
                for (int i = 0; i < numChild; i++) {
                    System.out.println("Enter " + (/* first time it will be 0 then 1 2 3 */i + 1) + "th child of "
                            + frontNode.data);
                    int child = sc.nextInt();
                    // chile ke node bnaynge
                    TreeNode<Integer> chilNode = new TreeNode<Integer>(child);
                    // ab us child node ko root data jo frontnode hai usme add krenge ..
                    frontNode.childern.add(chilNode);
                    // add krne ke baad us queue me child node aur root ko add kr denge..
                    pendingNodes.enqueue(chilNode);
                    // iske bad loop se bahar aaynge aur 2 ke liye puchenge .. fir 2 bahar niklega
                    // aur uske child node puchenge fir same kaam krenge jasie pehle kiya hai hm
                    // logo ne
                    // last me sare ke liye ho jayga
                }
            } catch (QueueEmptyException e) {
                // TODO: handle exception

                return null;
            }
        }
        // aur last me return kr denge sare root ko

        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.childern.size(); i++) {
            s = s + root.childern.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.childern.size(); i++) {
            print(root.childern.get(i));
        }
    }

    // public static void printLevelWise(TreeNode<Integer> root){
    // Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
    // q.add(root);
    // q.add(null);
    // while(!q.isEmpty()){
    // TreeNode<Integer> front = q.poll();
    // if(front == null){
    // if(q.isEmpty()){
    // return;
    // }
    // else{
    // q.add(null);
    // System.out.println();
    // continue;
    // }
    // }
    // System.out.print(front.data + " ");
    // for(int i = 0; i<front.children.size(); i++){
    // q.add(front.children.get(i));
    // }
    // }

    // }

    // }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputleverwiss();
        print(root);
    }
}
