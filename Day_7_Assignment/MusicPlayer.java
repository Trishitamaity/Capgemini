package Day_7_Assignment;

public interface MusicPlayer {
	void play();
	void pause();
	void stop();
}
class Spotify_Player implements MusicPlayer {
	public void play() {
		System.out.println("Play the music");
	}
	public void pause() {
		System.out.println("Pause the music");
	}
	public void stop() {
		System.out.println("Stop the music");
	}
}
class Youtube_Music_Player implements MusicPlayer {
	public void play() {
		System.out.println("Play the music");
	}
	public void pause() {
		System.out.println("Pause the music");
	}
	public void stop() {
		System.out.println("Stop the music");
	}
}