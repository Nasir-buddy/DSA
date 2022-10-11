package DSA.Array.Algo;

import java.util.Scanner;

public class Binary_Search {
    static Scanner sc = new Scanner(System.in);
    public static int BSearch(int input[], int elem) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (elem == input[mid]) {
                return mid;
            } else if (elem > input[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.print("Printing the default array.... : ");
        print(arr);     
        System.out.print("Enter the element that you want to find : ");
        int element = sc.nextInt();
        int output = BSearch(arr, element);
        System.out.println(output);
    }
}
