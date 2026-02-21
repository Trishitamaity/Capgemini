package DSA_Day_5;
import java.util.HashSet;

public class Unique_Elements {
    public static void find_unique_elements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Unique elements:");
        for (int num : set) {
            if (!duplicates.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6};
        find_unique_elements(arr);
    }
}