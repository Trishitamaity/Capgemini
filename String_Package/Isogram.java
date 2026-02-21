package String_Package;
import java.util.Scanner;

public class Isogram {
	public static boolean Isogram(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(Isogram(s));
	}
}