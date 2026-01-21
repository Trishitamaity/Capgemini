package Day_8_Assignment;

public class Singleton_Class {
	private static Singleton_Class singleton;
	private Singleton_Class() {
	}
	public static Singleton_Class getSingleton_Class() {
		if (singleton == null)
			singleton = new Singleton_Class();
		return singleton;
	}
	public static void main(String[] args) {
		Singleton_Class obClass = Singleton_Class.getSingleton_Class();
		Singleton_Class obClass1 = Singleton_Class.getSingleton_Class();
		if (obClass == obClass1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}