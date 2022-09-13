package DSA.Array;
import java.util.Scanner;
public class All_Indices_of_number {
    static Scanner s = new Scanner(System.in);

    public static int[] allIndexes(int input[], int x) {
        return allIndexes(input, x, 0);
    }

    public static int[] allIndexes(int input[], int x, int startIndex) {
        if (startIndex == input.length) {
            int output[] = new int[0];
            return output;
        }

        int smallAns[] = allIndexes(input, x, startIndex + 1);
        if (input[startIndex] == x) {
            int answer[] = new int[smallAns.length + 1];
            answer[0] = startIndex;
            for (int i = 0; i < smallAns.length; i++) {
                answer[i + 1] = smallAns[i];
            }
            return answer;
        } else {
            return smallAns;
        }
    }

    public static int[] takeInput() {
        System.out.print("Enter the size of the Array : ");
        int size = s.nextInt();
        int[] input = new int[size];
        System.out.print("Enter the elements of the Array : ");
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        int output[] = All_Indices_of_number.allIndexes(input, x);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
