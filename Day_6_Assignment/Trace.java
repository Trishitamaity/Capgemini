package Day_6_Assignment;
import java.util.Scanner;

class Trace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int sum = 0;
        System.out.println("Enter the matrix");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++)
            sum += a[i][i];
        System.out.println("Trace = " + sum);
    }
}