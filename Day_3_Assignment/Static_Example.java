package Day_3_Assignment;

public class Static_Example {
	static int a = 10;
	static int b;
	static String pm = "Modi";
	static String c;
	public static void e1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(pm);
		System.out.println(c);
	}
	public static void e2() {
		int a = 20;
		System.out.println(a);
		System.out.println(Static_Example.a);
	}
	public static void e3() {
		System.out.println(	Where_args.name);
	}
	public static void main(String[] args) {
		e1();
		e2();
		e3();
	}
}
