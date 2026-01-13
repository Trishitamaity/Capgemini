package Capgemini;

public class Narrowing {
	public static void main(String[] args) {
		double c = 55.55;
		int d = (int)c;
		System.out.println(d);
		
		long e = 20;
		int f = (int)e;
		System.out.println(f);
		
		float pp = 23.32f;
		int p2 = (int)pp;
		System.out.println(p2);
		
		int i = 98;
		char p4 = (char)i;
		System.out.println(p4);
	}

}
