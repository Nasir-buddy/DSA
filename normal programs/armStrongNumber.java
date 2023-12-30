import java.util.Scanner;

public class armStrongNumber {
    public static int check_Armstron(int n){
        int rem;
        int result = 0;
        while(n != 0){
            rem = n % 10;
            result = result + (rem * rem * rem);
            n /= 10; 
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ans = check_Armstron(n);
        if(ans == temp){
            System.out.println("Number is armstrong.");
        } else {
            System.out.println("Number is not armstrong.");
        }

    }
}
