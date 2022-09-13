package DSA.recursion;
import java.util.Scanner;
public class Sum_of_N_numbers {

    public static int sum (int n )
    {
        if(n == /*😘*/ 1)
        {
            return 1;
        }
        else 
        {
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum of natural numbers : ");
        int n = sc.nextInt(); 
        System.out.print(sum(n));
    }
}
