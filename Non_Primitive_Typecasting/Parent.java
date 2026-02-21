package Non_Primitive_Typecasting;

public class Parent {
	int a = 10;
	public void m1() {
		System.out.println("Parent");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		c.m2();
	}
}
class Child extends Parent{
	int a = 20;
	public void m2() {
		System.out.println(a);
		System.out.println(super.a);
		super.m1();
		this.m1();
		System.out.println(this);
	}
}