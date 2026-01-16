package Polymorphism;

public class Map1 {
	public void route() {
		System.out.println("Give the direction");
	}
	public static void main(String[] args) {
		Map1 m1 = new Map1();
		m1.route();
		Map2 m2 = new Map2();
		m2.route();
		Map3 m3 = new Map3();
		m3.bookcab();
		Map1 map = new Map3();
		map.route();
		Map3 m4 = (Map3) map;
		m4.bookcab();
		m4.route();
	}
}
class Map2 extends Map1 {
	@Override
	public void route() {
		System.out.println("Give the direction");
		System.out.println("Give the duration");
	}
}
class Map3 extends Map2 {
	public void bookcab() {
		System.out.println("Cab booked");
	}
}