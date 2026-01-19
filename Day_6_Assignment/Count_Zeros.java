package Day_6_Assignment;
import java.util.Scanner;

class Count_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int count = 0;
        System.out.println("Enter the matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0)
                    count++;
            }
        System.out.println("Number of zeros = " + count);
    }
}
