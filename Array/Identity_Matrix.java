package Array;
import java.util.Scanner;

class Identity_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        boolean flag = true;
        System.out.println("Enter the matrix");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j && a[i][j] != 1) flag = false;
                if (i != j && a[i][j] != 0) flag = false;
            }
        System.out.println(flag ? "Identity Matrix" : "Not Identity Matrix");
    }
}