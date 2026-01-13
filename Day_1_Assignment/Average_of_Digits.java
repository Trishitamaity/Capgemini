package Capgemini;

public class Average_of_Digits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            count++;
            num = num / 10;
        }
        double average = (double) sum / count;
        System.out.println("Average of digits: " + average);
    }
}