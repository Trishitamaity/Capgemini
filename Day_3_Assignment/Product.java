package Day_3_Assignment;

public class Product {
	int id;
	String name;
	double price;
	int ratings;
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product(int id, String name, double price, int ratings) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(ratings);
	}
	public static void main(String[] args) {
		Product p1 = new Product(1, "Colgate");
		Product p2 = new Product(2, "Sweet", 25);
		Product p3 = new Product(3, "Chips", 22.52, 4);
		p1.display();
		p2.display();
		p3.display();
		
	}
}
