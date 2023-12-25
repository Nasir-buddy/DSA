import java.util.Scanner;

public class prime_flag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime ");
        }
    }
}