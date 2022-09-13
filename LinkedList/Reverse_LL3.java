package DSA.LinkedList;
import java.util.Scanner;
public class Reverse_LL3 {
    public static Node<Integer> reverseRLL_Better3(Node<Integer> head){
		if(head == null || head.next == null)
        {
            return head; 
        }
            Node<Integer> reversedTail = head.next;
            Node<Integer> smallhead= reverseRLL_Better3(head.next);
            reversedTail.next = head;
            head.next = null; 

            return smallhead;
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
		 head = reverseRLL_Better3(head);
		print(head);
    }
}
