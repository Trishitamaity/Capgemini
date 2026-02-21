package Enum;
import java.util.*;

public class Char_Frequency {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(67, "A");
		map.put(30, "B");
		map.put(50, "C");
		map.put(83, "D");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}