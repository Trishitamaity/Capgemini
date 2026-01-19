package Day_6_Assignment;
import java.util.Scanner;

class Equal_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        boolean equal = true;
        System.out.println("Enter 1st matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter 2nd matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] != b[i][j])
                    equal = false;
        System.out.println(equal ? "Equal Matrices" : "Not Equal");
    }
}
