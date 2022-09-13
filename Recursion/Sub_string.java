package DSA.recursion;
import java.util.Scanner;
public class Sub_string {
    public static String[] findsubsequence(String str)
    {
        if(str.length() == 0)
        {
            String ans[] = {""};
            return ans;
        }
        String smallAns[] = findsubsequence(str.substring(1));
        String ans [] = new String[2 * smallAns.length];

        int k = 0;
        for(int i = 0; i < smallAns.length; i++)
        {
            ans[i] = smallAns[i];
            k++;
        }
        for(int i = 0; i < smallAns.length; i++)
        {
            // ans[i + smal lans.length]
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        String ans[] = findsubsequence(str);
        for(int i = 0; i < ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
}
