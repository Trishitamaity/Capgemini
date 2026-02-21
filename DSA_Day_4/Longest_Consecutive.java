package DSA_Day_4;
import java.util.HashSet;

public class Longest_Consecutive {
    public static int longest_consecutive(int[] arr) {
        if (arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longest = 1;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 2, 5, 200, 1, 4, 3};
        System.out.println("Longest consecutive sequence length: " + longest_consecutive(arr));
    }
}