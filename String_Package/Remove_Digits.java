package String_Package;
import java.util.Scanner;

public class Remove_Digits {
	public static String Remove_digits(String s) {
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				s2 = s2 + s.charAt(i);
			}
		}
		return s2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(Remove_digits(s));
	}
}