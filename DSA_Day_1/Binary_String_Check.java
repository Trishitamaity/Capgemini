package DSA_Day_1;
import java.util.Scanner;

public class Binary_String_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isBinary = true;
        for (char ch : str.toCharArray()) {
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }
        if (isBinary) {
            System.out.println("The string is a binary string");
        } else {
            System.out.println("The string is not a binary string");
        }
        sc.close();
    }
}
