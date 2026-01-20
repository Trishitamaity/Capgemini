package Array;
import java.util.Scanner;

class Multiply_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows for 1st matrices");
        int r1 = sc.nextInt();
        System.out.println("Enter the no of columns for 1st matrices");
        int c1 = sc.nextInt();
        System.out.println("Enter the no of rows for 2nd matrices");
        int r2 = sc.nextInt();
        System.out.println("Enter the no of columns for 2nd matrices");
        int c2 = sc.nextInt();
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] mul = new int[r1][c2];
        System.out.println("Enter first matrix");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter second matrix");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    mul[i][j] += a[i][k] * b[k][j];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(mul[i][j] + " ");
            System.out.println();
        }
    }
}