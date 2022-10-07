package DSA.Practice.Questions;
import java.util.Scanner;

public class CalculatePowerR {
    public static int CAL_power(int x , int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        int multiply = CAL_power(x , n - 1);
        return x * multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt(); 
        System.out.print("Enter the power to calculate : ");
        int n = sc.nextInt();
        System.out.println(CAL_power(x,n));
    }
}
