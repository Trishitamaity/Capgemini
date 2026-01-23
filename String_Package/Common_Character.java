package String_Package;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Common_Character {
	public static void Common_character(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if(ch1[i] == ch2[j]) {
					set.add(ch1[i]);
				}
			}
		}
		for (char c : set) {
            System.out.println(c);
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd string");
        String s2 = sc.nextLine();
        Common_character(s1, s2);
	}
}