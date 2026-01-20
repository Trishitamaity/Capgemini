package Day_7_Assignment;

public class Dog implements Animal {
	@Override
	public void colour() {
		System.out.println("Dog's colour is black");
	}
	@Override
	public void sound() {
		System.out.println("Bhou bhou");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.colour();
		d.sound();
		Lion l = new Lion();
		l.colour();
		l.sound();
		Cat c = new Cat();
		c.colour();
		c.sound();
		Animal a1 = new Dog();
		a1.colour();
		a1.sound();
		Cat c2 = (Cat) a1;
	}
}
class Lion implements Animal {
	@Override
	public void colour() {
		System.out.println("Lion's colour is yellow");
	}
	@Override
	public void sound() {
		System.out.println("Roar");
	}
}
class Cat implements Animal {
	@Override
	public void colour() {
		System.out.println("Cat's colour is white");
	}
	@Override
	public void sound() {
		System.out.println("Meow meow");
	}
}