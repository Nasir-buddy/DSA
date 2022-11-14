package DSA.Array.Algo;

import java.util.Scanner;
public class Selection_Sort {
    public static void sort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j  = i + 1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
    public static void print(int arr[]){
        System.out.println("Printing the sorted array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the element of the array : ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    sort(arr);
    print(arr);
    }
}
