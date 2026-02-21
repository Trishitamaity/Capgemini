package DSA_Day_5;
import java.util.*;

public class Max_Sliding_Window {
    public static int[] max_sliding_window(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -5, 3, 6, 7};
        int k = 3;
        int[] ans = max_sliding_window(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}