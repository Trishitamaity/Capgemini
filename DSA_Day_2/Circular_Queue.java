package DSA_Day_2;
import java.util.Scanner;

public class Circular_Queue {
    int[] queue;
    int front, rear, size;
    Circular_Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println(value + " inserted");
    }
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[front] + " removed");
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }
    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        Circular_Queue cq = new Circular_Queue(size);
        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    cq.enqueue(sc.nextInt());
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}