package Day_4_Assignment;

public class Encapsulation {
	String name;
	private int pass;
	public Encapsulation() {
	}
	public Encapsulation(String name, int pass) {
		this.name = name;
		this.pass = pass;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public static void main(String[] args) {
		Encapsulation s = new Encapsulation();
		s.name = "Trishita";
		s.setPass(123);
		System.out.println(s.name);
		System.out.println(s.getPass());
	}
}
