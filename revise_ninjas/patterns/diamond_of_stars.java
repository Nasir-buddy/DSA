package DSA.revise_ninjas.patterns;
import java.util.Scanner;
public class diamond_of_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int n = sc.nextInt();
        int num = (n / 2) + 1;
        int count = num - 1;
        for(int i = 1; i <= num; i++){
            for(int space = 1; space <= count; space++){
                System.out.print(" ");
            }
            count--;
            for(int k = 1; k <= (2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        count = 1;
        for(int i = 1; i <= (num - 1); i++){
            for(int space = 1; space <= count; space++){
                System.out.print(" ");
            }
            count++;
            for(int k = 1; k <= (2*(num - i)) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
