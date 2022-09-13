package DSA.LinkedList;
import java.util.Scanner;
public class reverseLL_iterative {

    public static Node<Integer> reverse_Iterative(Node<Integer> head){
        Node<Integer> current = head; 
        Node<Integer> previous = null;
        Node<Integer> temp;

        while (current != null)
        {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
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
		head = reverse_Iterative(head);
		print(head);
    
  }
}
