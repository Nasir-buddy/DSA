package DSA.Strings;
import java.util.Scanner;
public class basic_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first number for calculation : ");
        double n = sc.nextDouble();
        System.out.print("Enter second number for calculation : ");
        double x = sc.nextDouble();
        char calc;
        System.out.print("Choose operator in '+' , '-' , '*' , '/' : "); 
      
        calc = sc.next().charAt(0);
        double result;
        
        switch (calc) {
            case '+':
                result = n + x; 
                System.out.print("The addition of two numbers is : " + result);
                break;
        case '-':
                result = n - x; 
                System.out.print("The addition of two numbers is : " + result);
                break;
        case '/':
                result = n / x; 
                System.out.print("The addition of two numbers is : " + result);
                break;
        case '*':
                result = n * x; 
                System.out.print("The addition of two numbers is : " + result);
                break;
        
            default:
            System.out.print("Invalid operato!!!!!!!");
                break;
        }
    }
}
