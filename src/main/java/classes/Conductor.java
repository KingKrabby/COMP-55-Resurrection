package classes;

public class Conductor {
	public Conductor(int bpm, Song music, int speed, Food notes[]){
		BPM = bpm;
		song = music;
		reactionTime = speed;
		mapNotes = notes;
	}
	private int BPM;
	private double currentBeat;
	private Song song;
	private int reactionTime;
	private Food mapNotes[];
	void setBPM(int bpm) {
		BPM = bpm;
	}
	int getBPM(){
		return BPM;
	}
	void playSong(String level) {
		song.playSound("songs", level + ".mp3");
	}
	void stopSong(String level) {
		song.stopSound("songs", level + ".mp3");
	}
	double getCurrentBeat() {
		return 0;
	}
	public static void main(String[] args) {
		Song testSong = Song.getInstance();
		Conductor testConductor = new Conductor(150, testSong, 1, null);
		testConductor.playSong("tutorial");
	}
}
