package DSA.Kadane_Algorithm;

import java.util.Scanner;

public class Its_kadane {
    public static int Kadane(int arr[]){
        int current_sum = arr[0];
        int orignal_sum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(current_sum >= 0){
                current_sum += arr[i];
            }
            else {
                current_sum = arr[i];
            }
            if(current_sum > orignal_sum){
                orignal_sum = current_sum;
            }
        }
        return orignal_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Kadane(arr));
    }
}
