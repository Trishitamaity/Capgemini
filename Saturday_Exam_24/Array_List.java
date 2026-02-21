package Saturday_Exam_24;
import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Java");
		a1.add("SQL");
		a1.add("Python");
		System.out.println(a1);
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		a1.remove("Java");
		System.out.println(a1);
		System.out.println(a1.size());
		ArrayList a2 = new ArrayList();
		a2.add(45.8);
		a2.add("C++");
		a2.add(20);
		a2.add(null);
		ArrayList a3 = new ArrayList(a2);
		a3.add(100);
		System.out.println(a3);
		a3.set(1, "SQL");
		a3.set(2, 200);
		System.out.println(a3);
	}
}