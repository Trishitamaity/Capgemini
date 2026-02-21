package Enum;
import java.util.*;

public class Stack_Example {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		stack.push("C");
		System.out.println("Top element: " + stack.peek());
		System.out.println(stack.pop());
		stack.push("Javascript");
		System.out.println("Updated stack: " + stack);
		System.out.println(stack.pop());
		System.out.println("Updated stack: " + stack);
	}
}