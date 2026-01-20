package Day_7_Assignment;

public class Child_Test implements Test {
	@Override
	public void m2() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		Child_Test ct = new Child_Test();
		ct.m2();
		Test.m3();
		System.out.println(Test.a);
	}
}