package String_Package;
import java.util.Scanner;

public class Special_Symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int count = 0;
        String special = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                count++;
                special = special + ch + " ";
            }
        }
        System.out.println("Special symbols: " + special);
        System.out.println("Number of special symbols: " + count);
    }
}