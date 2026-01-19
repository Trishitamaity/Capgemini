package Day_6_Assignment;

public abstract class Shape {
	public abstract void area();
	public void display() {
		System.out.println("Display");
		area();
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.display();
		Rectangle r = new Rectangle();
		r.display();
		Shape s1 = new Circle();
		s1.display();
		Shape s2 = new Rectangle();
		s2.display();
	}
}
class Circle extends Shape {
	public void area() {
		System.out.println("Circle area is displayed");
	}
}
class Rectangle extends Shape {
	public void area() {
		System.out.println("Rectangle area is displayed");
	}
}