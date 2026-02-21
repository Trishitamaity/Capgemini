package Enum;
import java.util.TreeSet;

public class Tree {
	public static void Treeset_Generic() {
		TreeSet<Integer> treeset  = new TreeSet<>();
		treeset.add(70);
		treeset.add(45);
		treeset.add(51);
		treeset.add(45);
		System.out.println("Generic treeset :" + treeset);
		treeset.remove(51);
		System.out.println("Generic treeset :" + treeset);
	}
	public static void main(String[] args) {
		Treeset_Generic();
	}
}