package DSA.Array;

public class array_sortOrNot {
    public static boolean CheckSorted(int input[])
    {
        if(input.length <= 1)
        {
            return true;
        }
        int smallInput[] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++)
        {
            smallInput[i -1] = input[i];
        }
        boolean smallAns = CheckSorted(smallInput);
        {
            if(smallAns)
            {
                return false;
            }
            if(input[0] <= input[1])
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String[] args)
    {
        int input [] = {1,2,3,6,9};
        System.out.print(CheckSorted(input));
    }
}
