package DSA.Array;

public class Find_unique {
    public static void main(String[] args) {
        int arr[]  = {1, 1, 2,2, 3, 4,4 ,5,5,6,6};
            int n = 11; 
            for (int i = 0; i < n; i++) {
                int count = 0; 
                    for (int j = 0; j < n; j++) {
                        if (arr[j] == arr[i]) {
                            count++;
                        }
                        if(count == 1)
                        {
                            System.out.print(arr[i]);     
                        } 
                    }
            }
    }
}
