package DSA.Kadane_Algorithm;
import java.util.Scanner;
public class Flip_Bits {

    public static int FlipBits(int arr[] , int n){
        int sum = 0; 
        int max_sum = 0; 
        int orignal_sum = 0;
        for(int i = 0; i < n; i++){
            int temp = 0; 
            if(arr[i] == 0){
                temp = 1;
            }else{
                temp = -1;
                orignal_sum++;
                sum = 0; 
            }
            sum = Math.max(0 , sum + temp);
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum + orignal_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter only Bits : ");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(FlipBits(arr, n));
    }
}
