package DSA.Dynamic_Programming;

public class Fibonacci_DP {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Memotiation
    public static int fibM(int n) {
        int storage[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            storage[i] = -1;
        }
        return fibM(n, storage);
    }

    public static int fibM(int n, int storage[]) {
        if (n == 0 || n == 1) {
            storage[n] = n;
            return storage[n];
        }
        if (storage[n] != -1) {
            return storage[n];
        }

        storage[n] = fibM(n - 1, storage) + fibM(n - 2, storage);
        return storage[n];
    }

    // Dynamically
    public static int fibDP(int n) {
        int storage[] = new int[n + 1];
        storage[0] = 0;
        storage[1] = 1;

        for (int i = 2; i <= n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        // for calculating time

        // main program begins from here

        int n = 43;
        // Dynamically
        System.out.println("Dynamically...");

        long on = System.nanoTime();
        System.out.println("Answer = " + fibDP(n));

        long khatam = System.nanoTime();
        System.out.println("Program took : " + (khatam - on) / 1000000. + "ms");

        // Memotiation
        System.out.println("Memotiation...");
        long suru = System.nanoTime();
        System.out.println("Answer = " + fibM(n));

        long last = System.nanoTime();
        System.out.println("Program took : " + (last - suru) / 1000000. + "ms");

        // Fully recursively

        System.out.println("Recursively");
        long start = System.nanoTime();
        System.out.println("Answer = " + fib(n));
        // for ending time
        long end = System.nanoTime();
        System.out.println("Program took : " + (end - start) / 1000000. + "ms");
    }
}
