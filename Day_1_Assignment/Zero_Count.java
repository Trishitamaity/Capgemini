package Capgemini;

public class Zero_Count {
    public static void main(String[] args) {
        int num = 10203040;
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                int digit = num % 10;
                if (digit == 0) {
                    count++;
                }
                num = num / 10;
            }
        }
        System.out.println("Number of zeros: " + count);
    }
}