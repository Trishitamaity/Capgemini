package Enum;
import java.util.*;

public class Treemap {
	public static void Treemap_Generic() {
		TreeMap<String, Integer> tree  = new TreeMap<String, Integer>();
		tree.put("Trishita", 70);
		tree.put("Srijita", 45);
		tree.put("Suvojit", 51);
		System.out.println("Generic treemap :" + tree);
	}
	public static void main(String[] args) {
		Treemap_Generic();
	}
}