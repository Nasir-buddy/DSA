package DSA.recursion;

import java.util.Scanner;

public class Calculate_power {
    public static int calcP(int x , int n){
        if(n == 0){
            return 1;
        }

        int smallAns = calcP(x , n - 1);
        int ans = smallAns * x;
        return ans;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        System.out.print("Enter the power : ");
        int n = sc.nextInt();

        int received = Calculate_power.calcP(x, n);
        System.out.println(received);
    }
}
