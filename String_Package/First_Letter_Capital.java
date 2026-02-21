package String_Package;
import java.util.Scanner;

public class First_Letter_Capital {
	public static String convert(String s) {
	    char[] ch = s.toCharArray();
	    ch[0] = Character.toUpperCase(ch[0]);
	    for (int i = 1; i < ch.length; i++) {
	        if (ch[i - 1] == ' ') {
	            ch[i] = Character.toUpperCase(ch[i]);
	        }
	    }
	    return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(convert(s));
	}
}