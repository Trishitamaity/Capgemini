package DSA_Day_1;
import java.util.Scanner;

public class Pattern_Search {
    public static void search_pattern(String text, String pattern) {
        int text_len = text.length();
        int pattern_len = pattern.length();
        boolean found = false;
        for (int i = 0; i <= text_len - pattern_len; i++) {
            int j;
            for (j = 0; j < pattern_len; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern_len) {
                System.out.println("Pattern found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Pattern not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();
        System.out.print("Enter the pattern: ");
        String pattern = sc.nextLine();
        search_pattern(text, pattern);
        sc.close();
    }
}