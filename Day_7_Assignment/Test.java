package Day_7_Assignment;

public interface Test {
	public static final int a = 30;
	int b = 20;
	private void m1() {
		System.out.println("Private method");
	}
	default void m2() {
		System.out.println("Default method");
	}
	public static void m3() {
		System.out.println("Static method");
	}
}