package DSA.Dynamic_Programming;

import Normal_programs.Solution;
import Normal_programs.prime_func;

public class min_cost_path_recursive {
    public static int minCostpath(int arr[][]) {
        return minCostpath(arr, 0, 0);
    }
    // Min cost path from cell (i , j) to cell ( m - 1 , n - 1)

    private static int minCostpath(int[][] arr, int i, int j) {
        int row = arr.length;
        int col = arr[0].length;
        
        if(i == row - 1 && j == col - 1){
            return arr[i][j];
        }
        // if row or col go out of range 
        if(i >= row || j >= col){
            return Integer.MAX_VALUE;
        }

        int opt1 = minCostpath(arr , i , j + 1);
        int opt2 = minCostpath(arr , i + 1 , j + 1);
        int opt3 = minCostpath(arr , i + 1 , j);

        return arr[i][j] + Math.min(opt1, Math.min(opt2, opt3));
    }

    public static void main(String[] args) {
        // i am making a default arryay you can make a function for a dynamic function
        // array
        int arr[][] = { { 1, 1, 1 }, { 4, 5, 2 }, { 7, 8, 9 } };
        System.out.print("Minimum path is : ");
        System.out.print(minCostpath(arr));


    }
}
