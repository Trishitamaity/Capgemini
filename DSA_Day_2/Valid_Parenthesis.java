package DSA_Day_2;

import java.util.Stack;

public class Valid_Parenthesis {
	public static boolean Valid_parerthesis(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char top = stack.pop();
					if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
						return false;
					}else {
						return true;
					}
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String str1 = "[{({()})}]";
		String str2 = "[{{(})}]";
		System.out.println(Valid_parerthesis(str1));
		System.out.println(Valid_parerthesis(str2));
	}
}