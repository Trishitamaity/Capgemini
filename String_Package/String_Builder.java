package String_Package;

public class String_Builder {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("xyz");
		StringBuilder s2 = new StringBuilder("xyz");
		String s = new String(s1);
		StringBuilder s3 = new StringBuilder(s);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.reverse());
		System.out.println(s1.append(" Java"));
		System.out.println(s2.capacity());
	}
}