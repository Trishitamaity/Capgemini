package Capgemini;

class Odd_Numbers {
    public static void main(String[] args) {
        int n1 = 1, n2 = 20;
        System.out.println("All the odd numbers are: ");
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0)
                System.out.println(i + " ");
        }
    }
}