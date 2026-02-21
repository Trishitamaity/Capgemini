package DSA_Day_2;
import java.util.Stack;

public class Stack_Example {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(534);
		stack.push(265);
		stack.push(214);
		stack.push(986);
		stack.push(553);
		stack.push(287);
		System.out.println("Using for loop");
		for(int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		System.out.println("Using foreach loop");
		for(int elements : stack) {
			System.out.println(elements);
		}
		System.out.println("Using while loop");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}