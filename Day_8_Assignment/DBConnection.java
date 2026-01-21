package Day_8_Assignment;

public class DBConnection {
	private static DBConnection con;
	private DBConnection() {
	}
	public static DBConnection getDBConnection() {
		if(con == null) {
			con = new DBConnection();
			return con;
		}else {
			return con;
		}
	}
}