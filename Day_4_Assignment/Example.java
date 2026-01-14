package Day_4_Assignment;

public class Example {
	int a1;
	static int a2;
	Laptop l1;
	static Laptop l2;
	public Example() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(this.l1);
	}
	public void m1() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(l1);
		System.out.println(l2);
	}
	public static void m2() {
		Example e = new Example();
		System.out.println(e.a1);
		System.out.println(a2);
		System.out.println(e.l1);
		System.out.println(l2);
	}
	public static void main(String[] args) {
		Example e = new Example();
		e.m1();
		m2();
	}
}