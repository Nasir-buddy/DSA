package DSA.Array;

import java.util.Scanner;


public class Second_largest_Element {
    public static void SecondLargest(int arr[]){
        int largest = 0; 
        int secondlargest = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[largest]){
                secondlargest = largest;
                 largest = i;
            } else if(arr[i] != arr[largest]){
                if(secondlargest == -1 || arr[i] > arr[secondlargest]){
                    secondlargest = i;
                }
            }
            if(secondlargest == -1){
                System.out.print("-1");
            }
        }
        System.out.print(arr[secondlargest]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.print("Enter the element of the array : ");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        SecondLargest(arr);
        
    }
}
