package Day_5_Assignment;

public class Call_Statement {
	public Call_Statement() {
		System.out.println("c1");
	}
	public Call_Statement(int a) {
		this();
		System.out.println("c2");
	}
	public static void main(String[] args) {
		Call_Statement a1 = new Call_Statement();
		Call_Statement a2 = new Call_Statement(5);
		Call b1 = new Call();
		Call b2 = new Call(3);
	}
}
class Call extends Call_Statement{
	public Call() {
		super();
		System.out.println("c3");
	}
	public Call(int b) {
		super(b);
		System.out.println("c4");
	}
}