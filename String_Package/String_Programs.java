package String_Package;
import java.util.Scanner;

public class String_Programs {
	public static int Count(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				count++;
			}
		}
		return count;
	}
	public static void Convert(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				char small = (char)(s.charAt(i) + 32);
				System.out.print(small);
			}else {
				char caps = (char)(s.charAt(i) - 32);
				System.out.print(caps);
			}
		}
	}
	public static void Substring_1(String s) {
		System.out.println();
		System.out.println(s.contains("love"));
		System.out.println(s.contains("java"));
		System.out.println(s.contains("python"));
	}
	public static void Remove_space(String s) {
		System.out.println(s.trim());
	}
	public static void Substring_2(String s) {
		System.out.println(s.substring(1));
		System.out.println(s.substring(2));
		System.out.println(s.substring(1, 4));
		System.out.println(s);
	}
	public static void Split(String s) {
		String[] str = s.split(" ");
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	public static void Char_array(String s) {
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		String s1 = new String(c);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(Count(s));
        Convert(s);
        Substring_1(s);
        Remove_space(s);
        Substring_2(s);
        Split(s);
        Char_array(s);
	}
}