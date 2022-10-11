package DSA.Array.Algo;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Binary_Search {
    public static int BSearch(int input[], int elem) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (elem == mid) {
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
        Scanner sc = new Scanner(System.in);
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
        print(arr);
        BSearch(takeinput() , 4);
        print(arr);
    }
}
