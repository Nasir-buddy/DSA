package DSA.Array;

import java.util.Scanner;

public class Linear_srh {
    public static int searching(int Arr[], int x) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] Input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        return Arr;
    }

    public static void main(String[] args) {
        int Arr[] = Input();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(searching(Arr, x));
    }
}
