package DSA.recursion;

import java.util.Scanner;

public class print_keypad_combination {
    public static void printkeypad(long input) {
        printkeypad(input, "");
    }

    public static void printkeypad(long input, String output) {
        if (input == 0) {
            System.out.println(output);
            return;
        }
        long rem = input % 10;
        char helperArray[] = helper(rem);

        printkeypad(input / 10, helperArray[0] + output);
        printkeypad(input / 10, helperArray[1] + output);
        printkeypad(input / 10, helperArray[2] + output);

        if (helperArray.length == 4) {
            printkeypad(input / 10, helperArray[3] + output);
        }
    }

    public static char[] helper(long n) {
        if (n == 2) {
            char ch[] = { 'a', 'b', 'c' };
            return ch;
        } else if (n == 3) {
            char ch[] = { 'd', 'e', 'f' };
            return ch;
        } else if (n == 4) {
            char ch[] = { 'g', 'h', 'i' };
            return ch;
        } else if (n == 5) {
            char ch[] = { 'j', 'k', 'l' };
            return ch;
        } else if (n == 6) {
            char ch[] = { 'm', 'n', 'o' };
            return ch;
        } else if (n == 7) {
            char ch[] = { 'p', 'q', 'r', 's' };
            return ch;
        } else if (n == 8) {
            char ch[] = { 't', 'u', 'v' };
            return ch;
        } else if (n == 9) {
            char ch[] = { 'w', 'x', 'y', 'z' };
            return ch;
        }

        else {
            char ch[] = { ' ' };
            return ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the keypad number : ");
        long input = sc.nextInt();
        long start = System.nanoTime();
        print_keypad_combination.printkeypad(input);
        long end = System.nanoTime();
        System.out.println("Program took : " + (end - start) / 1000000. + "ms");
    }
}
