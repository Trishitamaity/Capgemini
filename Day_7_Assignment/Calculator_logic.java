package Day_7_Assignment;

public class Calculator_logic implements Calculator {
	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	@Override
	public void multi(int a, int b) {
		System.out.println(a * b);
	}
	@Override
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	public static void main(String[] args) {
		Calculator_logic c = new Calculator_logic();
		c.add(3, 4);
		c.multi(5, 6);
		c.sub(9, 7);
	}
}