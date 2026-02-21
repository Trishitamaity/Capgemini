package Enum;
import java.util.*;

public class Linked_List {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("C");
		System.out.println("First element: " + list.get(0));
		list.set(1, "Javascript");
		list.remove("C++");
		System.out.println("Updated list: " + list);
	}
}