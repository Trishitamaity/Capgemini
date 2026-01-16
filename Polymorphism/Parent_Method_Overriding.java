package Polymorphism;

public class Parent_Method_Overriding {
	public void home() {
		System.out.println("Blue");
	}
	public static void main(String[] args) {
		Parent_Method_Overriding p1 = new Parent_Method_Overriding();
		p1.home();
		Child_Method_Overriding c = new Child_Method_Overriding();
		c.home();
		Parent_Method_Overriding p2 = new Child_Method_Overriding();
		p2.home();
	}
}
class Child_Method_Overriding extends Parent_Method_Overriding {
	@Override
	public void home() {
		System.out.println("Red");
	}
	public void bike() {
		System.out.println("BMW");
	}
}