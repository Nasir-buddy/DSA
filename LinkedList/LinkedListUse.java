package DSA.LinkedList;
public class LinkedListUse {
    public static void main(String[] args) {
        Node <Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        node1.next = node2;
        node2.next = node3;
        Node<Integer> head = node1;
        while (head != null){
        System.out.print(head.data + " ");
        head = head.next;
        } 
         while (head != null){
        System.out.print(head.data + " ");
        head = head.next;
        }
    }
}