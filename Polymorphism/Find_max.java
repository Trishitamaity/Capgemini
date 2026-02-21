package Polymorphism;

public class Find_max {
	public int max(int a, int b) {
		int max = (a > b) ? a : b;
		return max;
	}
	public int max(int a, int b, int c) {
		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		return max;
	}
	public float max(float a, float b) {
		float max = (a > b) ? a : b;
		return max;
	}
	public float max(int a, float b) {
		float max = (a > b) ? a : b;
		return max;
	}
	public static void main(String[] args) {
		Find_max f = new Find_max();
		System.out.println(f.max(45, 67));
		System.out.println(f.max(45, 67, 654));
		System.out.println(f.max(45.87f, 67.67f));
		System.out.println(f.max(45, 6778.565f));
	}
}