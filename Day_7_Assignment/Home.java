package Day_7_Assignment;

public interface Home {
	void price();
	void colour();
}
class Father implements Home {
	public void price() {
		System.out.println("Father made the house");
	}
	public void colour() {
		System.out.println("Father paint the house");
	}
}
class Son implements Home {
	public void price() {
		System.out.println("Son stayed in the house");
	}
	public void colour() {
		System.out.println("Son paint the house");
	}
}
class PersonProperty {
	private Home h;
	public Home getH() {
		return h;
	}
	public void setH(Home h) {
		this.h = h;
	}
}