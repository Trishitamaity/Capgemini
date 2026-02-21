package String_Package;
import java.util.Arrays;

public class String_Methods {
	public static void main(String[] args) {
		char[] ch = {'b', 'a', 'c'};
		char[] ch2 = {'c', 'a', 'b'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch2));
		System.out.println(Arrays.equals(ch, ch2));
		System.out.println(Arrays.binarySearch(ch, 'a'));
	}
}