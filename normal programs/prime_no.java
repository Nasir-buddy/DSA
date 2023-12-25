import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0; 
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    d++;
                }
            }
            if(d == 2){
                System.out.println(i);
            }
            d = 0;
        }
    }
}
