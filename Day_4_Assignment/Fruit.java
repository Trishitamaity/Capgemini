package Day_4_Assignment;

public class Fruit {
	String name;
	String colour;
	public Fruit() {
	}
	public Fruit(String name, String colour){
		this.name = name;
		this.colour = colour;
	}
	public static void main(String[] args) {
		Apple apple = new Apple("Apple", "Red", 240);
		System.out.println(apple.name);
		System.out.println(apple.colour);
		System.out.println(apple.price);
		Fruit f = new Fruit("Guava", "Green");
		System.out.println(f.name);
		System.out.println(f.colour);
	}
}
class Apple extends Fruit{
	double price;
	public Apple(String name, String colour, double price){
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
}