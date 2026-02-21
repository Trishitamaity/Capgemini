package DSA_Day_5;

public interface Parent {
	void function(Number number);
	void function(Integer number);
}
class Child implements Parent {
	@Override
	public void function(Number number) {
		System.out.println("Number : " + number);
	}
	@Override
	public void function(Integer number) {
		System.out.println("Integer : " + number);
	}
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.function(4);
		parent.function(4.8);
	}
}