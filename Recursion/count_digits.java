package DSA.recursion;

import java.util.Scanner;

public class count_digits {
    public static int countwords(int n){
        if(n == 0){
            return 0;
        }
        int small = countwords(n / 10);
        int ans = small + 1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = count_digits.countwords(n);
        System.out.print(result);
    }
}
