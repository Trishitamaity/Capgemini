package String_Package;
import java.util.Scanner;

public class Reverse_Word {
	public static void Split(String s) {
		String[] str = s.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        Split(s);
	}
}