package String_Package;
import java.util.Scanner;

public class Find_Element_at_Index {
	public static void Find_element(String s) {
		System.out.println(s.indexOf('b'));
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("java", 5));
		System.out.println(s.lastIndexOf('b'));
		System.out.println(s.lastIndexOf('a'));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String s = sc.nextLine();
        Find_element(s);
	}
}