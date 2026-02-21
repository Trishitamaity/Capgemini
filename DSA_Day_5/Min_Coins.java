package DSA_Day_5;
import java.util.*;
public class Min_Coins {
    public static int minCoins(int amount, int[] coins) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount = amount - coins[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] set1 = {1, 2, 5, 20, 100};
        int result = minCoins(amount, set1);
        System.out.println("Minimum coins required: " + result);
    }
}