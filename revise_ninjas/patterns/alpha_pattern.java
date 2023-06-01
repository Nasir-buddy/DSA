package DSA.revise_ninjas.patterns;
import java.util.Scanner;
public class alpha_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char A = 65;
        for(int i = 0; i < n; i++){
            for(int spc = 0; spc <= n - i; spc++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
        
    }
}
