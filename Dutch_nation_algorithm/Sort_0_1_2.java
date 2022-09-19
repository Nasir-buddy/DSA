package DSA.Dutch_nation_algorithm;

import java.util.Scanner;

public class Sort_0_1_2 {

    public static void sort(int arr[]) {
        int i = 0; // 0 to j - 1 -> 0's area
        int j = 0; // j to i - 1 -> 1's area
        int k = arr.length - 1; // k + 1 to en d-> 2's end area

        // i to k is unknown
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }

        }
    }

    public static void swap(int arr[], int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of the array " + i + " : ");
            arr[i] = sc.nextInt();
        }
        sort(arr);
        print(arr);
    }
}
