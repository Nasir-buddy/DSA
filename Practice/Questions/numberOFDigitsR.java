package DSA.Practice.Questions;

import java.util.Scanner;

public class numberOFDigitsR {
    public static int digits(int n){
        if(n == 0){
            return 0;
        }
        int small = digits (n / 10); 
        int answer = small + 1; 
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(numberOFDigitsR.digits(n));
    }
}
