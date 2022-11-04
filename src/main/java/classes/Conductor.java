package classes;

public class Conductor {
	public Conductor(int bpm, song music, int speed, food notes[]){
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
	void playSong() {
		
	}
	void stopSong() {
		
	}
	double getCurrentBeat() {
		return 0;
	}
}

//public static void main(String[] args) {
////	song testSong = song.getInstance();
////	conductor testConductor = new conductor(150, )
//}