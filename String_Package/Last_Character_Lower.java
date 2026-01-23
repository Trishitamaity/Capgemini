package String_Package;
import java.util.Scanner;

public class Last_Character_Lower {
	public static String convert(String s) {
	    char[] ch = s.toCharArray();
	    ch[ch.length - 1] = Character.toLowerCase(ch[ch.length - 1]);
	    for (int i = 0; i < ch.length - 1; i++) {
	        if (ch[i + 1] == ' ') {
	            ch[i] = Character.toLowerCase(ch[i]);
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