package DSA.Dynamic_Programming;

import java.util.Scanner; 
public class perfect_square {
    public static int Square(int n){
        int []dp = new int[n + 1];
        dp[0] = 0; 
        dp[1] = 1;
        for(int i = 2 ; i <= n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j * j <= i; j++){
                int rem = i - j * j;
                if(dp[rem] < min){
                    min = dp[rem];
                }
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number : ");
        System.out.println(Square(n));
    }
}
