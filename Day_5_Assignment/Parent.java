package Day_5_Assignment;

public class Parent {
	String name;
	public Parent(String name) {
		this.name = name;
	}
	public void m1() {
		System.out.println("Parent method");
	}
	public static void main(String[] args) {
		Parent p = new Child("Suvojit", 1987654321);
		p.m1();
		Child c = new Child("Trishita", 1234567891);
		Parent p1 = c;
		p1.m1();
		c.m1();
		c.m2();
		Child c1 = (Child)p;
		c1.m1();
		c1.m2();
	}
}
class Child extends Parent{
	long phone;
	public Child(String name, long phone) {
		super(name);
		this.phone = phone;
	}
	public void m2() {
		System.out.println("Child method");
	}
}