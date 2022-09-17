package DSA.Dynamic_Programming;

public class Balance_BT {
    public static int coutBalanceBTs(int h , int mod) {
        if (h == 0 || h == 1) {
            return 1;
        }
        int x = coutBalanceBTs(h - 1);
        int y = coutBalanceBTs(h - 2);
        long res1 = (long)x * x;
        long res2 = (long)x * y * 2;
        int value1 = (int)(res1 % mod);
        int value2 = (int)(res2) % mod;
        return (value1 + value2) % mod;

    }
    public static int coutBalanceBTs(int h){
        int mod = (int)Math.pow(10, 9) + 7;
        return coutBalanceBTs(h , mod);
    }
    public static void main(String[] args) {
        int h = 12;

        long ans = coutBalanceBTs(h);
        System.out.println(ans);
    }
}
