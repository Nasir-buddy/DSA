package DSA.Strings;
import java.util.Scanner;
public class inp_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String str;
        String str1; 
        str = sc.nextLine();

        System.out.println(str + " " + str.length());

        str1 = sc.next();
        System.out.println(str1 + " " + str1.length());
    }
}
