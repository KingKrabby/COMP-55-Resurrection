package classes;
import javafx.util.Duration;
import java.util.Scanner;
//
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
		song.playSound("sounds", level + ".mp3");
	}
	void stopSong(String level) {
		song.stopSound("sounds", level + ".mp3");
	}
	double getCurrentBeat(String level) {
		if(song.findSound("sounds", level + ".mp3") == null) {
			return 0;
		}
		Duration songDuration = song.findSound("songs", level + ".mp3").getCurrentTime();
		double currentPos = (double)songDuration.toSeconds();
		currentBeat = currentPos * (BPM / 60);
		return currentBeat;
	}
	Food getCurrentNote(String level){
		double currentBeat = getCurrentBeat(level);
		for(int i = 0; i < mapNotes.length; i++) {
			if(mapNotes[i].getSpawnBeat() > Math.ceil(currentBeat)) {
				return mapNotes[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Song testSong = Song.getInstance();
		Conductor testConductor = new Conductor(150, testSong, 1, Map_Database.tutorialFood);
		Scanner scan = new Scanner(System.in);
		testConductor.playSong("tutorial");
		for(int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if(input == 1) {
				testConductor.stopSong("tutorial");
			}
			if (input == 2) {
				System.out.println(testConductor.getCurrentBeat("tutorial"));
				System.out.println(testConductor.getCurrentNote("tutorial"));
			}
		}
		System.exit(0);
	}
}
