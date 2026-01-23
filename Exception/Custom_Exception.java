package Exception;

public class Custom_Exception extends RuntimeException {
	public Custom_Exception(String message) {
		super(message);
	}
	public static void Check_exception(Custom_Exception[] arr) {
		for(Custom_Exception c : arr) {
			if(c == null) {
				throw new Custom_Exception("Object not found");
			}else {
				System.out.println("Object is found");
			}
		}
	}
	public static void main(String[] args) {
		Custom_Exception[] arr = new Custom_Exception[3];
		arr[0] = new Custom_Exception("Ok");
		arr[1] = null;
		arr[2] = new Custom_Exception("Ok");
		try {
			Check_exception(arr);
        }catch(Custom_Exception e) {
        	System.err.println("Custom exception is handled");
        }
	}
}