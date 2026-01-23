package String_Package;

public class Wrapper_Class {
	public static void main(String[] args) {
		int n1 = 10;
		Integer i1 = n1;
		int n2 = i1;
		Integer i2 = 80;
		Character c1 = 'A';
		Integer i3 = Integer.valueOf("123");
		Boolean b1 = Boolean.valueOf("true");
		Boolean b2 = Boolean.valueOf("tru");
		int a = Integer.parseInt("123");
		long b = Long.parseLong("567");
		System.out.println(i2);
		System.out.println(c1);
		System.out.println(i3 + 1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
}