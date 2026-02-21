package DSA_Day_4;

public abstract class Parent {
	public abstract void function(Number number);
	public abstract void function(Integer number);
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.function(4);
		parent.function(4.8);
	}
}
class Child extends Parent {
	@Override
	public void function(Number number) {
		System.out.println("Number : " + number);
	}
	@Override
	public void function(Integer number) {
		System.out.println("Integer : " + number);
	}
}