package DSA_Day_5;
import java.util.*;

public class String_List_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        System.out.print("Enter new string to add: ");
        String newString = sc.nextLine();
        list.add(newString);
        System.out.print("Enter position X to modify (0-based index): ");
        int x = sc.nextInt();
        if (x >= 0 && x < list.size()) {
            list.set(x, list.get(x) + newString);
        } else {
            System.out.println("Invalid position.");
        }
        System.out.println("Updated List:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}