package DSA_Day_2;

public class Custom_Queue {
	private int size;
	private int[] queue;
	private int front;
	private int rear;
	public Custom_Queue(int size) {
		queue = new int[size];
		this.size = size;
		this.front = 0;
		this.rear = -1;
	}
	public boolean isFull() {
		return rear == size - 1;
	}
	public boolean isEmpty() {
		return front >  rear;
	}
	public int enque(int element) {
		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		queue[++rear] = element;
		return element;
	}
	public int deque() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return queue[front++];
	}
	public int size() {
		return rear - front + 1;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return queue[rear];
	}
}