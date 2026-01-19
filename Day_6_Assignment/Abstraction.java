package Day_6_Assignment;

public abstract class Abstraction {
	public abstract int add(int a, int b);
	public abstract int multi(int a, int b);
	public abstract int sub(int a, int b);
	public static void main(String[] args) {
		Abstraction a = new Child();
		System.out.println(a.add(344, 3765));
		System.out.println(a.multi(304, 65));
		System.out.println(a.sub(4532, 3765));
		Child c = new Child();
		c.m1();
	}
}
class Child extends Abstraction {
	@Override
	public int add(int a,int b) {
		return a + b;
	}
	@Override
	public int multi(int a,int b) {
		return a * b;
	}
	@Override
	public int sub(int a, int b) {
		return a - b;
	}
	public void m1() {
		System.out.println("Child Method");
	}
}