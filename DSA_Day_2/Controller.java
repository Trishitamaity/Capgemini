package DSA_Day_2;

public class Controller {
	public static void main(String[] args) {
		Custom_Stack stack = new Custom_Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Stack elements are: ");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		Custom_Queue queue = new Custom_Queue(5);
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);
		System.out.println("Queue elements are: ");
		while(!queue.isEmpty()) {
			System.out.println(queue.deque());
		}
	}
}
class Custom_Stack {
	int[] stack;
	private int size;
	int top;
	public Custom_Stack(int size) {
		stack = new int[size];
		this.size = size;
		top = -1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == size - 1;
	}
	public int push(int element) {
		if(isFull()) {
			throw new RuntimeException("Stack Overflow");
		}
		stack[++top] = element;
		return element;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return stack[top--];
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return stack[top];
	}
	public int size() {
		return top + 1;
	}
}