package Exception;

public class Null_Pointer_Exception {
	public static void main(String[] args) {
        String s = null;
        try {
        	System.out.println(s.toLowerCase());
        }catch(NullPointerException e) {
        	System.out.println("Null pointer exception caught");
        }
        System.out.println("Program continues normally");
	}
}