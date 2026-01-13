package Day_3_Assignment;

public class College {
	String name;
	String location;
	public void exam() {
		System.out.println("UEM is taking our exam");
	}
	public void printCollege() {
		System.out.println("Student name is " + name);
		System.out.println(location + " is our college location");
	}
	public static void main(String[] args) {
		College s1 = new College();
		s1.name = "Trishita Maity";
		s1.location = "UEM Campus";
		s1.exam();
		s1.printCollege();
		College s2 = new College();
		s2.name = "Suvojit Maity";
		s2.location = "UEM Campus";
		s2.exam();
		s2.printCollege();
		College s3 = new College();
		s3.name = "Gracy Kumari";
		s3.location = "UEM Campus";
		s3.exam();
		s3.printCollege();
	}
}
