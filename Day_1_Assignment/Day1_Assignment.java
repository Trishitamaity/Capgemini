package Capgemini;

public class Day1_Assignment {
	public static void main(String[] args) {
		int a1 = 10, b1 = 5;
		System.out.println("Arithmetic Operators:");
		System.out.println("10 + 5 = " + (a1 + b1));
		int a2 = 25, b2 = 15;
		System.out.println("25 + 15 = " + (a2 + b2));
		
		int a3 = 20, b3 = 8;
		System.out.println("20 - 8 = " + (a3 - b3));
		int a4 = 50, b4 = 30;
		System.out.println("50 - 30 = " + (a4 - b4));

		int a5 = 6, b5 = 7;
		System.out.println("6 * 7 = " + (a5 * b5));
		int a6 = 9, b6 = 4;
		System.out.println("9 * 4 = " + (a6 * b6));

		int a7 = 40, b7 = 5;
		System.out.println("40 / 5 = " + (a7 / b7));
		int a8 = 81, b8 = 9;
		System.out.println("81 / 9 = " + (a8 / b8));

		int a9 = 17, b9 = 4;
		System.out.println("17 % 4 = " + (a9 % b9));
		int a10 = 29, b10 = 6;
		System.out.println("29 % 6 = " + (a10 % b10));
		
        int x = 10;
        System.out.println("Assignment Operators:");
        x += 5;
        System.out.println(x);
        x -= 3;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 4;
        System.out.println(x);
        x %= 3;
        System.out.println(x);
        
        int p = 15, q = 20;
        System.out.println("Relational Operators:");
        System.out.println("p < q : " + (p < q));
        System.out.println("p > q : " + (p > q));
        System.out.println("p <= q : " + (p <= q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        
        boolean m = true, n = false;
        System.out.println("Logical Operators:");
        System.out.println(m && n);
        System.out.println(m || n);
        System.out.println(!m);

        int i = 10;
        System.out.println("Increment / Decrement:");
        System.out.println("Post Increment (i++): " + (i++));
        System.out.println("Pre Increment (++i): " + (++i));
        System.out.println("Post Decrement (i--): " + (i--));
        System.out.println("Pre Decrement (--i): " + (--i));

        int num = 25;
        System.out.println("Conditional Operator:");
        String result1 = (num > 18) ? "Eligible to vote" : "Not eligible";
        System.out.println(result1);

        int u = 6, v = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("u & v : " + (u & v));
        System.out.println("u | v : " + (u | v));
        System.out.println("u ^ v : " + (u ^ v));
        System.out.println("~u : " + (~u));
        System.out.println("u << 1 : " + (u << 1));
        System.out.println("u >> 1 : " + (u >> 1));
	}
}
