package DSA_Day_2;
import java.util.Stack;

public class Next_Greater_Element {
    public static void findNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + nge[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        findNGE(arr);
    }
}