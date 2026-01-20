package Day_7_Assignment;

public class Property {
	public static void main(String[] args) {
		PersonProperty p = new PersonProperty();
		p.setH(new Father());
		Home h1 = p.getH();
		h1.price();
		h1.colour();
		p.setH(new Son());
		Home h2 = p.getH();
		h2.price();
		h2.colour();
	}
}