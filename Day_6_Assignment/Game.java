package Day_6_Assignment;

public abstract class Game {
	public abstract void start();
	public abstract void end();
	public void play() {
		start();
		end();
	}
	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.play();
		Football f = new Football();
		f.play();
		Game g1 = new Cricket();
		g1.play();
		Game g2 = new Football();
		g2.play();
	}
}
class Cricket extends Game {
	public void start() {
		System.out.println("Cricket started");
	}
	public void end() {
		System.out.println("Cricket ended");
	}
}
class Football extends Game {
	public void start() {
		System.out.println("Football started");
	}
	public void end() {
		System.out.println("Football ended");
	}
}