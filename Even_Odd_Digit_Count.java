package Capgemini;

public class Even_Odd_Digit_Count{
    public static void main(String[] args) {
        int num = 123456;
        int evenCount = 0;
        int oddCount = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }
}