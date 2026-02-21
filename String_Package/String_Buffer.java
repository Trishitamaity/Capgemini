package String_Package;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("xyz");
		StringBuffer s2 = new StringBuffer("xyz");
		String s = new String(s1);
		StringBuffer s3 = new StringBuffer(s);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.reverse());
		System.out.println(s1.append(" Java"));
		System.out.println(s2.insert(1, "abc"));
	}
}