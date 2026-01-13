package Day_3_Assignment;

public class Static_Block {
	static int a = 50;
	static {
		int a = 10;
		System.out.println("SB1");
		System.out.println(a);
		System.out.println(Static_Block.a);
	}
	static {
		System.out.println("SB2");
	}
	public static void main(String[] args) {
		System.out.println("Main");
	}
	static {
		System.out.println("SB3");
	}
}