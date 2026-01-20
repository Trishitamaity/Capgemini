package Day_7_Assignment;
import java.util.Scanner;

public class Fibonacci_Elements {
    public static boolean isFibonacci(int num) {
        if (num < 0)
            return false;
        int a = 0, b = 1;
        if (num == a || num == b)
            return true;
        int c = a + b;
        while (c <= num) {
            if (c == num)
                return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Fibonacci elements in the array:");
        for (int i = 0; i < n; i++) {
            if (isFibonacci(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}