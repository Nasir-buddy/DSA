package DSA.recursion;

import java.util.Scanner;

public class Last_IndexOfnumber {
    static Scanner sc = new Scanner(System.in);
    public static int lastindex(int arr[] , int x){
       return helper(arr , x , arr.length - 1);
    }

    private static int helper(int arr[] , int x , int startIndex){
        if(startIndex < 0){
            return -1;
        }
        if(arr[startIndex] == x){
            return startIndex;
        }
        return helper(arr, x, startIndex - 1);    
    }
    public static int[] takeinput(){
        
        System.out.print("Enter the size of the array : ");
        
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.print("Enter the element that you want to find : ");
        int x = sc.nextInt();
        int ans = Last_IndexOfnumber.helper(arr,  x , arr.length - 1);
        System.out.print(ans);
    }
}
