package DSA_Day_2;
import java.util.HashSet;
import java.util.Scanner;

public class First_Repeating_Index {
    public static int first_repeating_index(String stream) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            if (set.contains(ch)) {
                return i;
            } else {
                set.add(ch);
            }
        }
        return -1;
    }
    public static char first_repeating_element(String stream) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            if (set.contains(ch)) {
                return ch;
            } else {
                set.add(ch);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character stream: ");
        String stream = sc.nextLine();
        int index = first_repeating_index(stream);
        char ch = first_repeating_element(stream);
        if (index == -1) {
            System.out.println("No repeating character found");
        } else {
            System.out.println("First repeating character: " + ch);
            System.out.println("First repeating character index: " + index);
        }
        sc.close();
    }
}