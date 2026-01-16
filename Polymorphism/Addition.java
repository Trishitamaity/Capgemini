package Polymorphism;

public class Addition {
	public float add(int a, float b) {
		float add = a + b;
		System.out.println("1st method");
		return add;
	}
	public static int add(int a, int b) {
		int add = a + b;
		System.out.println("2nd method");
		return add;
	}
	public static float add(float a, float b) {
		float add = a + b;
		System.out.println("3rd method");
		return add;
	}
	public static double add(double a, double b) {
		double add = a + b;
		System.out.println("4th method");
		return add;
	}
	public static int add(int a, int b, int c, int d) {
		int add = a + b + c + d;
		System.out.println("5th method");
		return add;
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println(a.add(45, 756.78f));
		System.out.println(add(2, 4));
		System.out.println(add(454.78f, 667.78f));
		System.out.println(add(4554.78, 67567.78));
		System.out.println(add(4, 5, 7, 5));
	}
}