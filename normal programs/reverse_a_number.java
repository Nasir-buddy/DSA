import java.util.Scanner;

public class reverse_a_number {
    public static int reverse(int n){
        int reversed = 0; 
        while(n != 0){
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }   
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverse(n);
        System.out.println("Number after reversing : " + ans);
    }
}
