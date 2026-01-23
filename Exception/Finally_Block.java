package Exception;

public class Finally_Block {
	public static void main(String[] args) {
		System.out.println("Hiiii");
		try {
			System.out.println(7/0);
		}catch(NullPointerException e) {
        	System.out.println("Null pointer exception caught");
        }finally {
        	System.out.println("Finally block");
        }
        System.out.println("Program continues normally");
	}
}