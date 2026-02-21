package DSA_Day_3;

public interface Parent {
	void function(Number number);
}
class Main{
	public static void main(String[] args) {
		Parent parent = (Number number) -> System.out.println("Number : " + number);
		parent.function(4.89);
	}
}