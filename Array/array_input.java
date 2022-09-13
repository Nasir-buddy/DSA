package DSA.Array;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array that you want to give.."); 
        int size = sc.nextInt(); 
        System.out.println("Enter the elements of the Arrray..");
        int TakeInput[] = new int[size];
            for(int i = 0; i < size; i++)
            {
                TakeInput[i] = sc.nextInt();
            }
            for(int i = 0; i<size ; i++)
            {
                System.out.print(TakeInput[i]+" ");
            }
    }
}
