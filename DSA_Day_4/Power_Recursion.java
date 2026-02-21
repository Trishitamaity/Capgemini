package DSA_Day_4;

public class Power_Recursion {
    public static long power(long a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        long a = 2;
        int n = 6;
        long result = power(a, n);
        System.out.println(a + "^" + n + " = " + result);
    }
}