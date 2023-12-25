import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = is_Prime(n);
        if(prime){
            System.out.print("Prime number");
        } else {
            System.out.print("Not prime");
        }
    }
    public static boolean is_Prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
