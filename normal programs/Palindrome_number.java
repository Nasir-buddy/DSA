import java.util.Scanner;

public class Palindrome_number {
    public static int check_palindrome(int n){
        int result = 0; 
        int rem; 
        while(n != 0){
            rem = n % 10;
            result = result * 10 + rem;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ans = check_palindrome(n);
        if(temp == ans){
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is not Palindrome.");
        }
    }
}
