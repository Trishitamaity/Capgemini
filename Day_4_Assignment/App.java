package Day_4_Assignment;

public class App {
	String name;
	long size;
	public App() {
	}
	public App(String name, long size){
		this.name = name;
		this.size = size;
	}
	public void print() {
		System.out.println(name);
		System.out.println(size);
	}
}
