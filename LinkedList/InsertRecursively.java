package DSA.LinkedList;

import java.util.Scanner;

public class InsertRecursively {
    public static Node<Integer> takeInpur() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1) {
            Node<Integer> newnode = new Node<Integer>(data);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
            
                tail.next = newnode;
                tail = newnode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node<Integer> insert(Node<Integer> head , int pos, int elem)
    {
        if(pos == 0)
        {
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        } 
        if(head == null)
        {
            return head;
        }
        head.next = insert(head, pos - 1, elem); 
        return head;  
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInpur();
        head = insert(head, 2, 10);
        print(head);
    }
}
