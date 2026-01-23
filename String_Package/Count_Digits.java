package String_Package;
import java.util.Scanner;

public class Count_Digits {
	public static int Count_alphabet(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				count++;
			}
		}
		return count;
	}
	public static int Count_number(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;
			}
		}
		return count;
	}
	public static int Count_special_char(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$' || s.charAt(i) == '%' || s.charAt(i) == '^' || s.charAt(i) == '&' || s.charAt(i) == '*') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(Count_alphabet(s));
        System.out.println(Count_number(s));
        System.out.println(Count_special_char(s));
	}
}