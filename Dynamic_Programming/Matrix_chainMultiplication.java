package DSA.Dynamic_Programming;
import java.util.Scanner;
public class Matrix_chainMultiplication {
 
    public static int mcm(int[] p){
        int  n = p.length;
        int[][] storage = new int[p.length][p.length];
        for(int i =n-1;i>=0;i--) {
            for(int j=0;j<n;j++) {
                if( i +1 < j ) {
                    int min = Integer.MAX_VALUE;
                    int minIndex = 0;
                    for(int k=i+1;k<j;k++) {
                        int c = storage[i][k] + storage[k][j] + p[i] * p[k] * p[j] ;
                        if(c < min) {
                            min = c;
                            minIndex = k;
                        }
                    }
                    storage[i][j] = min ;
                }
            }
        }
        return storage[0][n-1];
    }
    
    
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int p[] = new int[n + 1];
		for(int i = 0; i <= n; i++){
			p[i] = s.nextInt();
		}
		System.out.println(mcm(p));
	}
}

