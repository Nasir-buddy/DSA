package DSA.recursion;

import java.util.Scanner;

public class alplabet_pattern {
    public static void printpattern(int n){
        int i = 1; 
        while(i <= n){
            int j = i;
            char ch = 64;
            while(j <= i){
                System.out.print((char)(ch));
                j++;;
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }
}
