package String_Package;

public class String_Class {
	public static void main(String[] args) {
		String a = "XYZ";
		String b = "xyz";
		String c = "abc";
		String d = "abc";
		String e = "Hello World";
		String f = " ";
		String g = "Hello hi hi students";
		String h = "    Hello students   ";
		String s1 = new String("xyz");
		String s2 = new String("abc");
		String s3 = new String("xyz");
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.getClass());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equals(c));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c == d);
		System.out.println(s1.equals(b));
		System.out.println(s1 == b);
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		d = d.toUpperCase();
		System.out.println(d);
		System.out.println(d.length());
		System.out.println(d.charAt(0));
		System.out.println(d.charAt(1));
		System.out.println(d.charAt(2));
		System.out.println(g.replace("hi", "bye"));
		System.out.println(g.replaceFirst("hi", "bye"));
		System.out.println(e.startsWith("Hello"));
		System.out.println(e.startsWith("He"));
		System.out.println(e.startsWith("Bye"));
		System.out.println(e.endsWith("ld"));
		System.out.println(e.endsWith("World"));
		System.out.println(h.stripLeading());
		System.out.println(h.stripTrailing());
		System.out.println(f.isEmpty());
		System.out.println(f.isBlank());
	}
}