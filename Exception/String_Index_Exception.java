package Exception;
import java.util.Scanner;

public class String_Index_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        try {
            System.out.println(s.charAt(s.length() + 2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds exception caught");
        }
        System.out.println("Program continues normally");
    }
}