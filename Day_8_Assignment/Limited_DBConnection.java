package Day_8_Assignment;

public class Limited_DBConnection {
	private static int con;
	private Limited_DBConnection() {
	}
	public static Limited_DBConnection getLimited_DBConnection() {
		con++;
		if(con > 5) {
			return null;
		}else {
			return new Limited_DBConnection();
		}
	}
	public static void main(String[] args) {
		Limited_DBConnection db1 = getLimited_DBConnection();
		Limited_DBConnection db2 = getLimited_DBConnection();
		Limited_DBConnection db3 = getLimited_DBConnection();
		Limited_DBConnection db4 = getLimited_DBConnection();
		Limited_DBConnection db5 = getLimited_DBConnection();
		Limited_DBConnection db6 = getLimited_DBConnection();
		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db6);
	}
}