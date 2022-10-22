package DSA.Array;
public class tofindlargestelement {
    public static int tofindMax(int arr[]){
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {23 , 21 , 54 , 45 , 34 , 86, 90, 43};
        System.out.print(tofindMax(arr));
    }
}
