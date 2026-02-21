package String_Package;
import java.util.Scanner;

public class Swap_First_Last {
	public static String convert(String s) {
		char[] ch = s.toCharArray();
	    int start = 0;
	    for (int i = 0; i <= ch.length; i++) {
	        if (i == ch.length || ch[i] == ' ') {
	            if (i - start > 1) {
	                char temp = ch[start];
	                ch[start] = ch[i - 1];
	                ch[i - 1] = temp;
	            }
	            start = i + 1;
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