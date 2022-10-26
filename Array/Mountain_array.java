package DSA.Array;
import java.util.Scanner;

public class Mountain_array {
    public static void MountainArray(int arr[]){
        int min = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                ans = i;
                min = arr[i];
            }
        }
        System.out.print("The index of the peek element is : " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.print("Enter the maountain array : ");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        MountainArray(arr);
        
    }
}
