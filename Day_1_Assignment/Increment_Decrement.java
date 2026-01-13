package Capgemini;

public class Increment_Decrement {
    public static void main(String[] args) {
        int a = 5, b = 10;
        a += 2;
        b /= 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a++ + --a + --a + --a + b++ + b--;
        b = b++ + a-- + a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}