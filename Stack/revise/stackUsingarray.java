package DSA.Stack.revise;

import java.util.Scanner;
import DSA.Stack.StackEmptyException;
import DSA.Stack.StackFullException;

public class stackUsingarray {
   private int data[];
   private int top; 

   //constructor
   public stackUsingarray(){
    data = new int[5];
    top = -1;
   }

   public stackUsingarray(int capacity){
      data = new int[capacity];
      top = -1; 
   }

   public boolean isEmpty(){
      return (top == -1);
   }

   public int size(){
      System.out.println(top + 1);
      return top + 1;
   }

   public int top()throws StackEmptyException{
      if(size() == 0) {
         StackEmptyException e = new StackEmptyException();
         throw e;
      }
      System.out.println(data[top] + " is the top element of the stack..");
      return data[top];
   }

   public void push(Scanner sc) throws StackFullException{
      if(size() == data.length){
         System.out.println("Calling Double capacity function.. ");
         doubleCapacity();
         // StackFullException e = new StackFullException();
         // throw e;
      }
      System.out.print("Enter the element of the stack : ");
      int element = sc.nextInt();
      top++;
      data[top] = element;
      System.out.println(element + " Pushed Successfully!!");
   } 

   public int pop() throws StackEmptyException{ 
      if(size() == 0){
         StackEmptyException e = new StackEmptyException();
         throw e;
      }
      int temp = data[top];
      top--;
      System.out.println("Stack poped is successfully done .... \n");
      return temp;
     
   }

   public void doubleCapacity(){
      int temp[] = data;
      data = new int[2 * temp.length];
      for(int i = 0 ; i < top ; i++){
         data[i] = temp[i];
      } 
   }
   public void display(){
      System.out.println("Printing the stack......");
      for(int i = top; i >= 0; i--){
         System.out.println(data[i]);
      }
   }
   public static void main(String[] args) throws StackEmptyException , StackFullException {
      Scanner sc = new Scanner(System.in);
      stackUsingarray stack = new stackUsingarray();
      System.out.print("******Stack Using Array******");
      System.out.println("\n-----------------------------");
      int choice = 0; 
      while(choice != 6){
         System.out.println("Choose from the below option.");
         System.out.println(" 1. Push \n 2. Pop \n 3. Display \n 4. Top \n 5. size \n 6. Exit");
         System.out.println("Enter your choice : ");
         choice = sc.nextInt();
         switch(choice){
            case 1:
            {
               stack.push(sc);
               break;
            }
            case 2:
            {
               stack.pop();
               break;
            }
            case 3:
            {
               stack.display();
               break;
            }
            case 4: 
            {
               stack.top();
               break;
            }
            case 5:
            {
               stack.size();
               break;
            }
            case 6:
            {
               System.out.println("Exiting program Successfully!!!!!");
               System.exit(0);   
               break;
            }
            default : 
            {
               System.out.print("Please enter the valid choice.....");
            }
         }
      }
   }
}
