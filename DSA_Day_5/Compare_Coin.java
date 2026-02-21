package DSA_Day_5;
import java.util.*;

public class Compare_Coin {
    public static int minCoins(int amount, int[] coins) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
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
        int[] set2 = {1, 2, 5, 10, 20, 50};
        int result1 = minCoins(amount, set1);
        int result2 = minCoins(amount, set2);
        System.out.println("Coins needed using Set 1: " + result1);
        System.out.println("Coins needed using Set 2: " + result2);
        if (result1 < result2)
            System.out.println("Set 1 uses fewer coins.");
        else if (result2 < result1)
            System.out.println("Set 2 uses fewer coins.");
        else
            System.out.println("Both sets use same number of coins.");
    }
}