package DSA.Array;
import java.util.Scanner;
public class Array_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of rows of first matrix : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of the column of first matrix : ");
        int column = sc.nextInt();

     
        int matrix1[][] = new int[row][column];
        int matrix2[][] = new int[row][column];
        int output[][] = new int[row][column];
        // getting first element 
        System.out.println("Enter the element of second matrix.");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print("Enter the element of "+i+ " row "+j+" column : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        //printing the 1st matrix 
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            {
                System.out.println();
            }
        }
        // getting element in second matrix 
        System.out.println("Enter the element of second matrix.");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0 ; j < column ; j++)
            {
                System.out.print("Enter the element of " + i +"row "+ j + "column : ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        //printing the matrix second 
        for(int i = 0; i < row ; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(matrix2[i][j]);
            }
            {
                System.out.println();
            }
        }
        //Adding the matrix 
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                output[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //printting the added matrix 
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(output[i][j] + " ");
            }
            {
                System.out.println();
            }
        }
    }
}
