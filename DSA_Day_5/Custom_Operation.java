package DSA_Day_5;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.IntPredicate;

public class Custom_Operation {
	public static List<Integer> filter_odd(int[] arr){
		List<Integer> answer = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	public static List<Integer> odd(int[] arr){
		IntPredicate int_predicate = (int value) -> {
			return value % 2 != 0;
		};
		return Arrays.stream(arr).filter(int_predicate).boxed().toList();
	}
	public static List<Integer> filter_even(int[] arr){
		List<Integer> answer = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	public static List<Integer> even(int[] arr){
		IntPredicate int_predicate = (int value) -> {
			return value % 2 == 0;
		};
		return Arrays.stream(arr).filter(int_predicate).boxed().toList();
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		System.out.println("Odd elements : " + filter_odd(arr));
		System.out.println("Original array : " + odd(arr));
		System.out.println("Even elements : " + filter_even(arr));
		System.out.println("Original array : " + even(arr));
	}
}