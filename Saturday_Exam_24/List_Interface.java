package Saturday_Exam_24;
import java.util.ArrayList;
import java.util.List;

public class List_Interface {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		System.out.println("First element : " + list.get(0));
		System.out.println("Second element : " + list.get(1));
		System.out.println("Third element : " + list.get(2));
		list.remove("Java");
		System.out.println(list);
		System.out.println(list.size());
	}
}