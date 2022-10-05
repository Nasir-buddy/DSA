package DSA.LinkedList;
import java.util.Scanner;
public class Solution {

    public static boolean isPalindrome_2(Node <Integer> head){
        if(head == null || head.next == null){
            return true;
        }
		int l = length(head);
		Node<Integer> t1 = head;
		int mid= l/2;
		boolean isPalindrome= true; 
		
		for(int i = 0;i<mid;i++) {
            System.out.println(t1.data);
		t1= t1.next;
            
		}
		Node<Integer> t2 = null;
		 t2= t1.next;
		 t1.next= null;
		 while(t2.next!=null) {
			 if(t2.data == t1.data) {
				 isPalindrome=true;
			 }
			 else {
				 isPalindrome=false;
                 break;
			 }
			 t1=t1.next;
			 t2=t2.next;
		 }
		 return isPalindrome;
}

public static int length(Node<Integer> head){
    int count=0;
    while(head!=null){
        count++;
        head=head.next;
    }
    return count;
}
public static   Node<Integer> takeInput(){
    Scanner s= new Scanner(System.in);
    int data = s.nextInt();
    Node<Integer> head = null;
    while(data != -1){
      Node<Integer> currentNode= new Node<Integer>(data);
      if(head==null){
        head=currentNode;
      }else{
        Node<Integer> tail = head;
        while(tail.next!=null){
            tail= tail.next;
        }
        tail.next= currentNode;
      }
      data=s.nextInt();
}
return head;
}
public static void main(String[] args) {
    Node<Integer> head = takeInput();
    System.out.println(isPalindrome_2(head));
}
}