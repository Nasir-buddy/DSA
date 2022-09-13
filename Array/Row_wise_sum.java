package DSA.Array;
import java.util.Scanner;
public class Row_wise_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of rows of first matrix : ");
        int row = sc.nextInt();
        // System.out.print("Enter the number of the column of first matrix : ");
        // int column = sc.nextInt();

     
        int matrix1[]= new int[row];
        // int matrix2[][] = new int[row][column];
        // int output[][] = new int[row][column];
        // getting first element 
        System.out.println("Enter the element of second matrix.");
        for(int i = 0; i < row; i++)
        {
            
                // System.out.print("Enter the element of "+i+ " row "+j+" column : ");
                matrix1[i] = sc.nextInt();
        }

        //printing the 1st matrix 
        for(int i = 0; i < row; i++)
        {
            {
                System.out.println();
            }
        }
    
        
        //Adding the matrix 
        for(int i = 0; i < row; i++)
        {
            {
                // output[i][j] = matrix1[i] + matrix1[j];
            }
        }

       
    }
}
