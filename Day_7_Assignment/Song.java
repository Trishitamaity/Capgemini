package Day_7_Assignment;

public class Song {
	public static void main(String[] args) {
		Spotify_Player s = new Spotify_Player();
		s.play();
		s.pause();
		s.stop();
		Youtube_Music_Player y = new Youtube_Music_Player();
		y.play();
		y.pause();
		y.stop();
	}
}