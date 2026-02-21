package Enum;
import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		System.out.println(a1);
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("0");
		a2.add("1");
		a2.add("2");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2, a2);
		System.out.println(a1);
	}
}