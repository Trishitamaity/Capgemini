package Day_4_Assignment;

public class Animal {
	String name;
	String colour;
	int legs;
	public Animal() {
	}
	public Animal(String name, String colour, int legs){
		this.name = name;
		this.colour = colour;
		this.legs = legs;
	}
	public void Print_Animal() {
		System.out.println(name);
		System.out.println(colour);
		System.out.println(legs);
	}
	public static void main(String[] args) {
		Dog d = new Dog("Bull dog", "Black", 1500);
		d.Print_Animal();
	}
}
class Dog extends Animal{
	public Dog(String name, String colour, int legs){
		this.name = name;
		this.colour = colour;
		this.legs = legs;
	}
}