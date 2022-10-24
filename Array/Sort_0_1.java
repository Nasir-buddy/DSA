package DSA.Array;

import java.util.Scanner;

public class Sort_0_1 {

    public static void sort01(int arr[]){
        int i = 0; 
        int j = 0; 
        while(i < arr.length){
            if(arr[i] == 1){
                i++;
            } else {
                swap(arr, i, j);    
                i++;
                j++;
            }
        }
    }

    public static void swap(int arr[] , int i , int j){
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : "); 
        int size = sc.nextInt();
        System.out.println("Enter the array element : ");
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sort01(arr);
        print(arr);
    }
}
