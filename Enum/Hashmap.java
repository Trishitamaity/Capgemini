package Enum;
import java.util.*;

public class Hashmap {
	public static void Hashmap_Generic() {
		HashMap<Integer, String> map  = new HashMap<Integer, String>();
		map.put(70, "Trishita");
		map.put(45, "Srijita");
		map.put(51, "Suvojit");
		Collection<String> a = map.values();
		System.out.println(a);
		Set<Integer> set = map.keySet();
		System.out.println(set);
		System.out.println("Generic hashmap :" + map);
		System.out.println(map.get(51));
		System.out.println(map.getOrDefault(20, "Raju"));
		System.out.println(map.containsKey(45));
		System.out.println(map.remove(45, "Srijita"));
		System.out.println("Generic hashmap :" + map);
	}
	public static void Hashmap_Nongeneric() {
		HashMap map = new HashMap();
		map.put(70, "Trishita");
		map.put(67, "Suvojit");
		map.put(null, null);
		System.out.println("Nongeneric hashmap :" + map);
		System.out.println(map.containsValue("Suvojit"));
		map.remove(null);
		System.out.println("Nongeneric hashmap :" + map);
	}
	public static void main(String[] args) {
		Hashmap_Generic();
		Hashmap_Nongeneric();
	}
}