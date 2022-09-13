package DSA.recursion;
import java.util.Scanner;
public class RemoveX {

    public static String removeX(String str){
        if(str.length()==0)
        {
            return str;
        }
        String ans = "";
        if(str.charAt(0)!='x')
        {
            ans = ans + str.charAt(0);
        }
        String smallans = removeX(str.substring(1));
        return ans + smallans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("You have entered : " + str);
        System.out.println("calling function for removing x ..");
        System.out.println("String after calling function..");
        System.out.println(removeX(str));
    }
}