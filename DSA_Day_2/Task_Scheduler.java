package DSA_Day_2;
import java.util.Scanner;

public class Task_Scheduler {
    String[] queue;
    int front, rear, size;
    Task_Scheduler(int size) {
        this.size = size;
        queue = new String[size];
        front = -1;
        rear = -1;
    }
    void addTask(String task) {
        if (rear == size - 1) {
            System.out.println("Task Queue is Full");
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rear] = task;
        System.out.println("Task added: " + task);
    }
    void executeTask() {
        if (front == -1 || front > rear) {
            System.out.println("No tasks to execute");
            return;
        }
        System.out.println("Executing task: " + queue[front]);
        front++;
    }
    void displayTasks() {
        if (front == -1 || front > rear) {
            System.out.println("No pending tasks");
            return;
        }
        System.out.println("Pending tasks:");
        for (int i = front; i <= rear; i++) {
            System.out.println("- " + queue[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum number of tasks: ");
        int size = sc.nextInt();
        sc.nextLine();
        Task_Scheduler scheduler = new Task_Scheduler(size);
        while (true) {
            System.out.println("\n1. Add Task\n2. Execute Task\n3. Display Tasks\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String task = sc.nextLine();
                    scheduler.addTask(task);
                    break;
                case 2:
                    scheduler.executeTask();
                    break;
                case 3:
                    scheduler.displayTasks();
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