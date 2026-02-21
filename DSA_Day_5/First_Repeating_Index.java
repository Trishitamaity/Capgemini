package DSA_Day_5;
import java.util.Scanner;

public class First_Repeating_Index {
    public static int first_repeating_index(String stream) {
        int[] index = new int[256];
        for (int i = 0; i < 256; i++) {
            index[i] = -1;
        }
        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            if (index[ch] == -1) {
                index[ch] = i;
            } else {
                return i;
            }
        }
        return -1;
    }
    public static char first_repeating_element(String stream) {
        boolean[] visited = new boolean[256];
        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            if (visited[ch]) {
                return ch;
            } else {
                visited[ch] = true;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character stream: ");
        String stream = sc.nextLine();
        int result = first_repeating_index(stream);
        if (result == -1) {
            System.out.println("No repeating character found");
        } else {
            System.out.println("First repeating character index: " + result);
        }
        char ch = first_repeating_element(stream);
        if (ch != '\0') {
            System.out.println("First repeating character: " + ch);
        }else {
        	System.out.println("No repeating character found");
        }
        sc.close();
    }
}