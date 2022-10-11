package DSA.Array.Algo;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    public static int linearSearch(int arr[], int elem) {
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == elem){
                return i;
            }
        }
        return -1;
    }

    public static int[] takeinput() {
        int size = sc.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.println("printing the default array : ");
        print(arr);
        System.out.println("Enter the element that you want to find : ");
        int element = sc.nextInt();
        System.out.println(LinearSearch.linearSearch(arr, element));
    }
}
