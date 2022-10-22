package DSA.recursion.Question;
import java.util.Scanner;
public class CalculatePower {
    public static int CalcPower(int x , int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        int multiply = CalcPower(x, n - 1);
        return x * multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(CalcPower(x , n));
    }
}
