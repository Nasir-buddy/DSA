package DSA.Backtracking;

import java.util.Scanner;

public class Rat_in_a_Maze {
    public static boolean ratInAMaze(int maze[][]) {
        int n = maze.length;
        int path[][] = new int[n][n];

        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
        // actual recursive login and actual backtracking is implemented her

        int n = maze.length;
        // Check if i , j cell is valir or not
        if (i < 0 || i >= n || j < 0 | j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
        // Inclede the cell in current path
        path[i][j] = 1;
        // Destination cell
        if (i == n - 1 && j == n - 1) {
            return true;
        }
        // Explore further in all direction
        // first direction is the first direction
        //top
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
        // Right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
        // Down
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
        // Left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2 D array ");
        int n = sc.nextInt();
        int maze[][] = new int[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter the maze element in only 0 and 1 " + i + " " + j + " : ");
                maze[i][j] = sc.nextInt();
            }
        }
        boolean pathPossible = ratInAMaze(maze);
        System.out.println(pathPossible);
    }
}
