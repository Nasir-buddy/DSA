package DSA.LinkedList;

import java.util.Scanner;

public class linked_list_print {
    // public static void print(Node<Integer> head)
    // {
    //     // Node<Integer> temp = head;
    //     while (head != null){
    //         System.out.print(head.data + " ");
    //         head = head.next;
    //         } 
    //         System.out.println();
            
    // }
    // public static void main(String[] args) {
    //     Node <Integer> node1 = new Node<Integer>(10);
    //     Node<Integer> node2 = new Node<Integer>(20);
    //     Node<Integer> node3 = new Node<Integer>(30);
    //     node1.next = node2;
    //     node2.next = node3;
    //     Node<Integer> head = node1;
    //     print(head);
    //     print(head);
        
    // }
    
    public static Node<Integer> takeInpur()
    {
        Node<Integer> head = null , tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1)
        {
            Node <Integer> newnode = new Node<Integer>(data);
             if(head == null)
             {
                 head = newnode;
                 tail = newnode;
             }
             else 
             {
                //  Node<Integer> temp = head;
                //  while(temp.next != null)
                //  {
                //      temp = temp.next;
                //  }
                //  temp.next = newnode;
                tail.next = newnode;
                tail = newnode; // tail = tail.next;
             }
             data = sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node<Integer> head = takeInpur();
        
        print(head);
        // Node<Integer> node1 = new Node<Integer>(12);        
        // Node<Integer> node2 = new Node<Integer>(56);        
        // Node<Integer> node3 = new Node<Integer>(23);        
        // node1.next = node2;
        // node2.next = node3;
        // Node <Integer> head = node1;
        // while(head != null)
        // {
        //     System.out.print(head.data + " ");
        //     head = head.next;
        // }
        // System.out.println();
    }
}
