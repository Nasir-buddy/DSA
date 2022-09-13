package DSA.Array;

import java.util.Scanner;

public class ArrayIP_fn {

    public static int [] TakeInput()
    {
        Scanner sc = new Scanner(System.in); 
        int Size = sc.nextInt(); 
        int TakeInput[] = new int[Size];

        for(int i = 0; i < Size; i++)
        {
            TakeInput[i] = sc.nextInt();
        }
        return TakeInput;
    }

    public static void PrintArray(int TakeInput[])
    {
        int size = TakeInput.length;
        for(int i = 0; i<size; i++)
        {
            System.out.print(TakeInput[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int Arr[] = TakeInput();
       PrintArray(Arr);
    }
}
