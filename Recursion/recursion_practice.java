package DSA.recursion;
import java.util.Scanner;
public class recursion_practice {

    public static int fact(int n)
    {
        if(n == -1)
        {
            return 1; 
        }
        else 
        {
            int smallans = fact(n-1);
            return  n * smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.print(ans);
    }
}
