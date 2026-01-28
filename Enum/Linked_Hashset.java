package Enum;
import java.util.LinkedHashSet;

public class Linked_Hashset {
	public static void Linked_Hashset_Generic() {
		LinkedHashSet<Integer> linked_hashset = new LinkedHashSet<>();
		linked_hashset.add(70);
		linked_hashset.add(45);
		linked_hashset.add(51);
		linked_hashset.add(45);
		System.out.println("Generic linked hashset :" + linked_hashset);
		linked_hashset.remove(51);
		System.out.println("Generic linked hashset :" + linked_hashset);
	}
	public static void Linked_Hashset_Nongeneric() {
		LinkedHashSet linked_hashset = new LinkedHashSet<>();
		linked_hashset.add(70);
		linked_hashset.add("Trishita");
		linked_hashset.add(null);
		linked_hashset.add(null);
		linked_hashset.add("Suvojit");
		System.out.println("Nongeneric linked hashset :" + linked_hashset);
		linked_hashset.remove(null);
		System.out.println("Nongeneric linked hashset :" + linked_hashset);
	}
	public static void main(String[] args) {
		Linked_Hashset_Generic();
		Linked_Hashset_Nongeneric();
	}
}