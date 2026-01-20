package Day_7_Assignment;
import java.util.Scanner;

public class First_Last_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of character array:");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("First character: " + arr[0]);
        System.out.println("Last character: " + arr[n - 1]);
        sc.close();
    }
}