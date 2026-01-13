package Day_3_Assignment;

public class Where_args {
	static String name = "Trishita Maity";
	public static double compare(double... n) {
		double max = 0;
		for(double i : n) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	public static String add(String... s) {
		String concat = "";
		for(String i : s) {
			concat = concat + i; 
		}
		return concat;
	}
	public static void main(String[] args) {
		String merge = add("Trishita ", "Maity");
		System.out.println(merge);
		double result = compare(44, 65.7, 54.65);
		System.out.println(result);
		Static_Example.e2();
	}
}