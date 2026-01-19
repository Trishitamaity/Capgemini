package Array;
import java.util.Scanner;

class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the matrix");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i][i] + " ");
        System.out.print("\nSecondary Diagonal: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i][n - i - 1] + " ");
    }
}