package DSA.LinkedList;
import java.util.Scanner;
public class reverseLL_2 {
    public static Double_node reverseRLL_Better(Node<Integer> head){
		if(head == null || head.next == null){
			Double_node ans = new Double_node();
			ans.head = head;
			ans.tail = head;
			return ans; // returning object form the other class .... 
		}
		Double_node smallAns = reverseRLL_Better(head.next);
        smallAns.tail.next = head;
		head.next = null;

		Double_node ans = new Double_node();
		ans.head = smallAns.head;
		ans.tail = head;

		return ans;
	}
	
	public static Node<Integer> takeInput()

	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Double_node ans = reverseRLL_Better(head);
		print(ans.head);
    
  }
}


	class Double_node {
    Node<Integer> head;
    Node<Integer> tail;
}

