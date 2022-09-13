package DSA.Array;

import java.util.Scanner;
public class Largest_Num {
        
    public static int LargestArray(int TakeInput[])
    {
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i<TakeInput.length; i++)
        {
            if(TakeInput[i]>maxValue)
            {
                maxValue = TakeInput[i];
            }
        }
        return maxValue;
    }
    public static void PrintArray(int TakeInput[])
    {
        int size = TakeInput.length;
        for(int i = 0; i<size; i++)
        {
            System.out.print(TakeInput[i]+" ");
        }
        System.out.println();
    }

    public static int[] TakeInput() {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int TakeInput[] = new int[Size];
        for(int i = 0; i<Size; i++)
        {
            TakeInput[i] = sc.nextInt();
        }
        return TakeInput;
    }

    public static void main(String[] args) {
        int Arr[] = TakeInput(); 
        PrintArray(Arr);
        int Largest = LargestArray(Arr);
        System.out.println("Largest Array is "+ Largest);
     }
}
