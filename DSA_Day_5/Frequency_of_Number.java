package DSA_Day_5;
import java.util.HashSet;

public class Frequency_of_Number {
    public static void first_repeating_frequency(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (set.contains(num)) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == num) {
                        count++;
                    }
                }
                System.out.println("First repeating number: " + num);
                System.out.println("Frequency: " + count);
                System.out.println("Index: " + i);
                return;
            } else {
                set.add(num);
            }
        }
        System.out.println("No repeating number found");
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6};
        first_repeating_frequency(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("First repeating number: " + arr[i]);
                System.out.println("Frequency: " + count);
                System.out.println("Index: " + (i + 1));
                return;
            }
        }
        System.out.println("No repeating number found");
    }
}