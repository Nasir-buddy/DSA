package DSA.Practice.Questions;

import java.util.Scanner;

public class PrintNumberR {
    public static void print(int n){
        if( n == 0){
            System.out.println(n + " ");
            return;
        }
        System.out.println("call function till base case hits... ");
        print(n - 1);
        {
            System.out.println(n + " ");
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number to print : ");
        PrintNumberR.print(n);
    }
}
