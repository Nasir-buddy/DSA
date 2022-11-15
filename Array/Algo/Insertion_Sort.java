package DSA.Array.Algo;
import java.util.Scanner;
public class Insertion_Sort {
    public static void sortI(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public static void print(int arr[]){
        System.out.println("Printing the sorted array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
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
    sortI(arr);
    print(arr);
    }
}
