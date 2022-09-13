package DSA.recursion;
import java.util.Scanner;
public class Quick_sort {
    static Scanner sc = new Scanner(System.in);
    public static void quicksort(int input[])
    {
        quickSort(input, 0, input.length -1 );
    }

    public static void quickSort(int[] input,int sI,int eI){
        //base case
           if(sI>=eI)
           {
               return;
           }
            int pivotPos = partition(input,sI,eI);
            quickSort(input,sI,pivotPos-1);
            quickSort(input,pivotPos+1,eI);
        }
        public static int partition(int input[],int sI,int eI)
        {
            int pivot=input[sI];
            int count=0;
            for(int i=sI+1;i<=eI;i++)
            {
                if(input[i]<=pivot)
                    count++;
            }
            int pivotPos = sI+count;
            int temp = input[sI];
            input[sI] = input[pivotPos];
            input[pivotPos] = temp;
            int i = sI;
            int j = eI;
            while(i < pivotPos && j > pivotPos)
            {
                if(input[i] <= input[pivotPos])
                {
                    i++;
                }
                else if(input[j] > input[pivotPos])
                {
                    j--;
                }
                else
                {
                    int temp_ = input[i];
                    input[i] = input[j];
                    input[j] = temp_;
                    i++;
                    j--;
                    
                }
            }
            return pivotPos;
        }
        

    public static int [] takeinput()
    {
        int size = sc.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the element of the array : ");
        for(int i = 0; i < size; i++)
        {
            input[i] = sc.nextInt();
        }
        return input;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int input[] = takeinput();
        Quick_sort.quicksort(input);
        for(int i = 0; i < input.length; i++)
        {
            System.out.print(input[i] + " ");
        }
    }
}