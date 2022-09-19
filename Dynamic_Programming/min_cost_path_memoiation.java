package DSA.Dynamic_Programming;

public class min_cost_path_memoiation {
    // Min cost path from cell (i , j) to cell ( m - 1 , n - 1)

    private static int minCostpath(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int storage[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                storage[i][j] = -1;
            }
        }

        return minCostpath(arr, 0, 0, storage);
    }

    private static int minCostpath(int[][] arr, int i, int j, int[][] storage) {
        int row = arr.length;
        int col = arr[0].length;
        if (i >= row || j >= col) {
            return Integer.MAX_VALUE;
        }
        if (i == row - 1 && j == col - 1) {
            storage[row - 1][col - 1] = arr[i][j];
            return storage[i][j];
        }
        if (storage[i][j] != -1) {
            return storage[i][j];
        }
        int opt1 = minCostpath(arr, i, j + 1, storage);
        int opt2 = minCostpath(arr, i + 1, j + 1, storage);
        int opt3 = minCostpath(arr, i + 1, j, storage);

        storage[i][j] = arr[i][j] + Math.min(opt1, Math.min(opt2, opt3));
        return storage[i][j];
    }

    public static void main(String[] args) {

        // i am making a default arryay you can make a function for a dynamic function
        // array
        int arr[][] = { { 1, 1, 1 }, { 4, 5, 2 }, { 7, 8, 9 } };
        System.out.print("Minimum path is : ");
        System.out.print(minCostpath(arr));

    }
}
