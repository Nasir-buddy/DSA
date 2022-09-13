package DSA.Array;

public class Arrar_operation {
    public static void main(String[] args) {
        //Initialization Array..
        int Arr[] = new int [100];
        // Storing data in array..
        //Storing array must be in range of the array size...
        Arr[99]  = 34;
        //Value of the array is 0 by default... 
        System.out.println(Arr[99]);


        char chArray[] = new char[10]; 
        chArray [4] = 'a';
        double dArray[] = new double[50]; 
        dArray[34] = 4.5;
        System.out.println(chArray[4]); 
        System.out.println(dArray[34]); 
    }
}
