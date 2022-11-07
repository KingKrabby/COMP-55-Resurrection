package classes;
import javafx.util.Duration;
import java.util.Scanner;

public class Conductor {
	public Conductor(double bpm, Song music, int speed, Food notes[]){
		BPM = bpm;
		song = music;
		reactionTime = speed;
		mapNotes = notes;
	}
	private double BPM;
	private double currentBeat;
	private Song song;
	private int reactionTime;
	private Food mapNotes[];
	void setBPM(int bpm) {
		BPM = bpm;
	}
	double getBPM(){
		return BPM;
	}
	void setBPM(double bpm) {
		BPM = bpm;
	}
	void playSong(String level) {
		song.playSound("songs", level + ".mp3");
	}
	void stopSong(String level) {
		song.stopSound("songs", level + ".mp3");
	}
	double getCurrentBeat(String level) {
		Duration songDuration = song.findSound("songs", level + ".mp3").getCurrentTime();
		double currentPos = (double)songDuration.toSeconds();
		currentBeat = currentPos * (BPM / 60);
		return currentBeat;
	}
	public static void main(String[] args) {
		Song testSong = Song.getInstance();
		Conductor testConductor = new Conductor(150, testSong, 1, null);
		Scanner scan = new Scanner(System.in);
		testConductor.playSong("tutorial");
		for(int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if(input == 1) {
				testConductor.stopSong("tutorial");
			}
			if (input == 2) {
				System.out.println(testConductor.getCurrentBeat("tutorial"));
			}
		}
		System.exit(0);
	}
}
