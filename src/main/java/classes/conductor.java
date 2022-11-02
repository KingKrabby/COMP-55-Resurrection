package classes;

public class conductor {
	public conductor(int bpm, song music, int speed, food notes[]){
		BPM = bpm;
		Song = music;
		reactionTime = speed;
		mapNotes = notes;
	}
	private int BPM;
	private double currentBeat;
	private song Song;
	private int reactionTime;
	private food mapNotes[];
	void setBPM(int bpm) {
		BPM = bpm;
	}
	int getBPM(){
		return BPM;
	}
	void stopSong() {
		
	}
	double getCurrentBeat() {
		return 0;
	}
}
