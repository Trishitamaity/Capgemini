package Enum;
import java.util.HashSet;

public class Hashset {
	public static void Hashset_Generic() {
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(70);
		hashset.add(45);
		hashset.add(51);
		hashset.add(45);
		System.out.println("Generic hashset :" + hashset);
		hashset.remove(51);
		System.out.println("Generic hashset :" + hashset);
	}
	public static void Hashset_Nongeneric() {
		HashSet hashset = new HashSet();
		hashset.add(70);
		hashset.add("Trishita");
		hashset.add(null);
		hashset.add(null);
		hashset.add("Suvojit");
		System.out.println("Nongeneric hashset :" + hashset);
		hashset.remove(null);
		System.out.println("Nongeneric hashset :" + hashset);
	}
	public static void main(String[] args) {
		Hashset_Generic();
		Hashset_Nongeneric();
	}
}