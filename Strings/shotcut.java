package DSA.Strings;
import java.util.Arrays;
import java.util.Scanner;
public class shotcut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int [50]; 
        for(int i = 0; i <= 6; i++)
        {
            Arr[i] = sc.nextInt();
        }
        Arrays.sort(Arr);
        for(int i = 43; i<50; i++)
        {
            System.out.print(Arr[i]);
        }
    }
}
