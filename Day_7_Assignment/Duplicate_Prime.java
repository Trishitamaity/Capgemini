package Day_7_Assignment;
import java.util.Scanner;

public class Duplicate_Prime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate prime elements:");
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1 && isPrime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}