package DSA.Array;

import java.util.Scanner;
import java.util.HashMap;
public class Largest_consecutive_sequence {

    public static void LongestCsubseqeunce(int arr[]){
        HashMap<Integer , Boolean> map = new HashMap<>();
        for(int val : arr){
            map.put(val, true);
        }

        for(int val : arr){
            if(map.containsKey(val - 1)){
                map.put(val , false);
            }
        }


        int maxstartpoint = 0; 
        int maxlength = 0;
        for(int val : arr){
            if(map.get(val) == true){
                int tempL = 1; 
                int tempStartpoint = val;

                while(map.containsKey(tempStartpoint + tempL)){
                    tempL++;
                }
                if(tempL > maxlength){
                    maxstartpoint = tempStartpoint;
                    maxlength = tempL;
                }
            }
        }
        for(int i = 0; i < maxlength; i++){
            System.out.println(maxlength + i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        LongestCsubseqeunce(arr);
    }

}