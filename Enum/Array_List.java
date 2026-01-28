package Enum;
import java.util.ArrayList;
import java.util.HashSet;

public class Array_List {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(50);
		a.add(50);
		a.add(10);
		System.out.println(a);
		HashSet<Integer> set = new HashSet<>(a);
		System.out.println(set);
		a.clear();
		a.addAll(set);
		System.out.println(a);
	}
}