package DSA.recursion;
import java.util.Scanner;

public class First_Index_of_number {
    static Scanner sc = new Scanner(System.in);
   public static int FirstIndex(int arr[] , int x){
    return helper(arr , x , 0);
   }
   public static int helper(int arr[] , int x , int startIndex){
    if(startIndex < arr.length){
        return -1;
    }
    if(arr[startIndex] == x){
        return startIndex;
    }
    return helper(arr, x, startIndex + 1);
   }

   public static int[] TakeInput(){
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the array : ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    return arr;
   }
    public static void main(String[] args) {
        int arr[] = TakeInput();
        System.out.print("Enter the element of that your want to find : ");
        int x = sc.nextInt();
        System.out.print(Last_IndexOfnumber.lastindex(arr, x));
    }
}
