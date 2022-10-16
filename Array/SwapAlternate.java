package DSA.Array;

import java.util.Scanner;

public class SwapAlternate {

    public static void swapalternate(int arr[]){
        for(int i = 0 ; i < arr.length - 1; i = i + 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int takeInput[] = new int [size];

        for(int i = 0; i < size; i++){
            takeInput[i] = sc.nextInt();
        }
        return takeInput;
    }

    public static void print(int takeInput[]) {
        System.out.println("Printing the array..");
        int size = takeInput.length;
        for (int i = 0; i < size; i++) {
            System.out.println(takeInput[i] + " ");
        }
        {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        swapalternate(arr);
        print(arr);
    }
}
